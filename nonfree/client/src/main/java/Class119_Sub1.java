import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!hda", name = "N", descriptor = "I")
	private int anInt3998;

	@OriginalMember(owner = "client!hda", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray10 = new byte[10][];

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "Lclient!sl;")
	private final Class3_Sub3 aClass3_Sub3_2 = new Class3_Sub3(null);

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "Lclient!sl;")
	private final Class3_Sub3 aClass3_Sub3_3 = new Class3_Sub3(null);

	@OriginalMember(owner = "client!hda", name = "M", descriptor = "I")
	private final int anInt3997;

	@OriginalMember(owner = "client!hda", name = "O", descriptor = "Lclient!la;")
	private final Class196 aClass196_43;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(ILclient!la;I)V")
	public Class119_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt3997 = arg2;
		this.aClass196_43 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method3527(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray209 == null) {
			if (!this.aClass196_43.method5115(0, this.anInt3997)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass196_43.method5102(this.anInt3997, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub3_3.aByteArray54 = local26;
			this.aClass3_Sub3_3.anInt4736 = 0;
			local46 = local26.length >> 1;
			this.anIntArray209 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray209[local52] = this.aClass3_Sub3_3.method4221();
			}
		}
		if (this.anInt3998 >= this.anIntArray209.length) {
			return -1;
		}
		this.method3535();
		this.aClass3_Sub3_3.aByteArray54 = arg0;
		this.aClass3_Sub3_3.anInt4736 = 0;
		do {
			if (this.aClass3_Sub3_3.aByteArray54.length <= this.aClass3_Sub3_3.anInt4736) {
				this.aClass3_Sub3_3.aByteArray54 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub3_2.aByteArray54 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass3_Sub3_3.aByteArray54 = null;
					return this.aClass3_Sub3_3.anInt4736;
				}
				this.aClass3_Sub3_2.aByteArray54 = this.aByteArrayArray10[0];
			}
			@Pc(125) int local125 = this.aClass3_Sub3_3.aByteArray54.length - this.aClass3_Sub3_3.anInt4736;
			local46 = this.aClass3_Sub3_2.aByteArray54.length - this.aClass3_Sub3_2.anInt4736;
			if (local125 < local46) {
				this.aClass3_Sub3_2.method4206(this.aClass3_Sub3_3.aByteArray54, local125, this.aClass3_Sub3_3.anInt4736);
				this.aClass3_Sub3_3.aByteArray54 = null;
				return arg0.length;
			}
			this.aClass3_Sub3_3.method4237(this.aClass3_Sub3_2.anInt4736, this.aClass3_Sub3_2.aByteArray54, local46);
			this.anInt3998++;
			this.aClass3_Sub3_2.anInt4736 = 0;
			this.aClass3_Sub3_2.aByteArray54 = null;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray10[local52] = this.aByteArrayArray10[local52 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt3998 < this.anIntArray209.length);
		this.aClass3_Sub3_3.aByteArray54 = null;
		return this.aClass3_Sub3_3.anInt4736;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)V")
	public void method3535() {
		if (this.anIntArray209 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
			if (this.anIntArray209.length <= this.anInt3998 + local17) {
				return;
			}
			if (this.aByteArrayArray10[local17] == null && this.aClass196_43.method5115(0, this.anIntArray209[this.anInt3998 + local17])) {
				this.aByteArrayArray10[local17] = this.aClass196_43.method5102(this.anIntArray209[local17 + this.anInt3998], 0);
			}
		}
	}
}
