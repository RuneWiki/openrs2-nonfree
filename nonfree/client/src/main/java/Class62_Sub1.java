import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
	private int anInt10050;

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "[[B")
	private final byte[][] aByteArrayArray165 = new byte[10][];

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "Lclient!rg;")
	private final Class6_Sub40 aClass6_Sub40_9 = new Class6_Sub40((byte[]) null);

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "Lclient!rg;")
	private final Class6_Sub40 aClass6_Sub40_10 = new Class6_Sub40((byte[]) null);

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
	private final int anInt10051;

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "Lclient!vd;")
	private final Class353 aClass353_130;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILclient!vd;I)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt10051 = arg2;
		this.aClass353_130 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([BB)I")
	@Override
	protected int method8480(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray610 == null) {
			if (!this.aClass353_130.method8407(0, this.anInt10051)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass353_130.method8404(this.anInt10051, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass6_Sub40_10.anInt10169 = 0;
			this.aClass6_Sub40_10.aByteArray113 = local26;
			local46 = local26.length >> 1;
			this.anIntArray610 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray610[local52] = this.aClass6_Sub40_10.method8571();
			}
		}
		if (this.anIntArray610.length <= this.anInt10050) {
			return -1;
		}
		this.method8487();
		this.aClass6_Sub40_10.anInt10169 = 0;
		this.aClass6_Sub40_10.aByteArray113 = arg0;
		do {
			if (this.aClass6_Sub40_10.aByteArray113.length <= this.aClass6_Sub40_10.anInt10169) {
				this.aClass6_Sub40_10.aByteArray113 = null;
				return arg0.length;
			}
			if (this.aClass6_Sub40_9.aByteArray113 == null) {
				if (this.aByteArrayArray165[0] == null) {
					this.aClass6_Sub40_10.aByteArray113 = null;
					return this.aClass6_Sub40_10.anInt10169;
				}
				this.aClass6_Sub40_9.aByteArray113 = this.aByteArrayArray165[0];
			}
			@Pc(133) int local133 = this.aClass6_Sub40_10.aByteArray113.length - this.aClass6_Sub40_10.anInt10169;
			local46 = this.aClass6_Sub40_9.aByteArray113.length - this.aClass6_Sub40_9.anInt10169;
			if (local133 < local46) {
				this.aClass6_Sub40_9.method8595(this.aClass6_Sub40_10.aByteArray113, local133, this.aClass6_Sub40_10.anInt10169);
				this.aClass6_Sub40_10.aByteArray113 = null;
				return arg0.length;
			}
			this.aClass6_Sub40_10.method8562(this.aClass6_Sub40_9.anInt10169, this.aClass6_Sub40_9.aByteArray113, local46);
			this.anInt10050++;
			this.aClass6_Sub40_9.anInt10169 = 0;
			this.aClass6_Sub40_9.aByteArray113 = null;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray165[local52] = this.aByteArrayArray165[local52 + 1];
			}
			this.aByteArrayArray165[9] = null;
		} while (this.anInt10050 < this.anIntArray610.length);
		this.aClass6_Sub40_10.aByteArray113 = null;
		return this.aClass6_Sub40_10.anInt10169;
	}

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "(I)V")
	public void method8487() {
		if (this.anIntArray610 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			if (this.anIntArray610.length <= this.anInt10050 + local11) {
				return;
			}
			if (this.aByteArrayArray165[local11] == null && this.aClass353_130.method8407(0, this.anIntArray610[this.anInt10050 + local11])) {
				this.aByteArrayArray165[local11] = this.aClass353_130.method8404(this.anIntArray610[local11 + this.anInt10050], 0);
			}
		}
	}
}
