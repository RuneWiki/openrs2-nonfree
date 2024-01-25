import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
	private int anInt3372;

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "[[B")
	private final byte[][] aByteArrayArray7 = new byte[10][];

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Lclient!fca;")
	private final Class3_Sub17 aClass3_Sub17_4 = new Class3_Sub17((byte[]) null);

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "Lclient!fca;")
	private final Class3_Sub17 aClass3_Sub17_5 = new Class3_Sub17((byte[]) null);

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
	private final int anInt3375;

	@OriginalMember(owner = "client!ft", name = "N", descriptor = "Lclient!gj;")
	private final Class143 aClass143_46;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILclient!gj;I)V")
	public Class133_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt3375 = arg2;
		this.aClass143_46 = arg1;
	}

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)V")
	public void method2973() {
		if (this.anIntArray234 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			if (this.anIntArray234.length <= this.anInt3372 + local11) {
				return;
			}
			if (this.aByteArrayArray7[local11] == null && this.aClass143_46.method3113(this.anIntArray234[this.anInt3372 + local11], 0)) {
				this.aByteArrayArray7[local11] = this.aClass143_46.method3125(0, this.anIntArray234[this.anInt3372 + local11]);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method2968(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (this.anIntArray234 == null) {
			if (!this.aClass143_46.method3113(this.anInt3375, 0)) {
				return 0;
			}
			@Pc(33) byte[] local33 = this.aClass143_46.method3125(0, this.anInt3375);
			if (local33 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub17_5.aByteArray59 = local33;
			this.aClass3_Sub17_5.lb = 0;
			local53 = local33.length >> 1;
			this.anIntArray234 = new int[local53];
			for (local59 = 0; local59 < local53; local59++) {
				this.anIntArray234[local59] = this.aClass3_Sub17_5.method4858();
			}
		}
		if (this.anIntArray234.length <= this.anInt3372) {
			return -1;
		}
		this.method2973();
		this.aClass3_Sub17_5.lb = 0;
		this.aClass3_Sub17_5.aByteArray59 = arg0;
		do {
			if (this.aClass3_Sub17_5.aByteArray59.length <= this.aClass3_Sub17_5.lb) {
				this.aClass3_Sub17_5.aByteArray59 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub17_4.aByteArray59 == null) {
				if (this.aByteArrayArray7[0] == null) {
					this.aClass3_Sub17_5.aByteArray59 = null;
					return this.aClass3_Sub17_5.lb;
				}
				this.aClass3_Sub17_4.aByteArray59 = this.aByteArrayArray7[0];
			}
			@Pc(132) int local132 = this.aClass3_Sub17_5.aByteArray59.length - this.aClass3_Sub17_5.lb;
			local53 = this.aClass3_Sub17_4.aByteArray59.length - this.aClass3_Sub17_4.lb;
			if (local132 < local53) {
				this.aClass3_Sub17_4.method4832(this.aClass3_Sub17_5.aByteArray59, this.aClass3_Sub17_5.lb, local132);
				this.aClass3_Sub17_5.aByteArray59 = null;
				return arg0.length;
			}
			this.aClass3_Sub17_5.method4838(this.aClass3_Sub17_4.lb, local53, this.aClass3_Sub17_4.aByteArray59);
			this.anInt3372++;
			this.aClass3_Sub17_4.lb = 0;
			this.aClass3_Sub17_4.aByteArray59 = null;
			for (local59 = 0; local59 < 9; local59++) {
				this.aByteArrayArray7[local59] = this.aByteArrayArray7[local59 + 1];
			}
			this.aByteArrayArray7[9] = null;
		} while (this.anIntArray234.length > this.anInt3372);
		this.aClass3_Sub17_5.aByteArray59 = null;
		return this.aClass3_Sub17_5.lb;
	}
}
