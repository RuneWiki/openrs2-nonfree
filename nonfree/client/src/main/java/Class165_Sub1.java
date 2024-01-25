import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	private int anInt8342;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "[[B")
	private final byte[][] aByteArrayArray20 = new byte[10][];

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "Lclient!cea;")
	private final Class2_Sub11 aClass2_Sub11_3 = new Class2_Sub11(null);

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "Lclient!cea;")
	private final Class2_Sub11 aClass2_Sub11_4 = new Class2_Sub11(null);

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "Lclient!in;")
	private final Class157 aClass157_226;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	private final int anInt8343;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILclient!in;I)V")
	public Class165_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass157_226 = arg1;
		this.anInt8343 = arg2;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
	public void method7065() {
		if (this.anIntArray547 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anIntArray547.length <= this.anInt8342 + local15) {
				return;
			}
			if (this.aByteArrayArray20[local15] == null && this.aClass157_226.method4574(this.anIntArray547[local15 + this.anInt8342], 0)) {
				this.aByteArrayArray20[local15] = this.aClass157_226.method4564(this.anIntArray547[this.anInt8342 + local15], 0);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[B)I")
	@Override
	protected int method7059(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray547 == null) {
			if (!this.aClass157_226.method4574(this.anInt8343, 0)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass157_226.method4564(this.anInt8343, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub11_4.aByteArray128 = local26;
			this.aClass2_Sub11_4.anInt10066 = 0;
			local46 = local26.length >> 1;
			this.anIntArray547 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray547[local52] = this.aClass2_Sub11_4.method8326();
			}
		}
		if (this.anInt8342 >= this.anIntArray547.length) {
			return -1;
		}
		this.method7065();
		this.aClass2_Sub11_4.aByteArray128 = arg0;
		this.aClass2_Sub11_4.anInt10066 = 0;
		do {
			if (this.aClass2_Sub11_4.aByteArray128.length <= this.aClass2_Sub11_4.anInt10066) {
				this.aClass2_Sub11_4.aByteArray128 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub11_3.aByteArray128 == null) {
				if (this.aByteArrayArray20[0] == null) {
					this.aClass2_Sub11_4.aByteArray128 = null;
					return this.aClass2_Sub11_4.anInt10066;
				}
				this.aClass2_Sub11_3.aByteArray128 = this.aByteArrayArray20[0];
			}
			@Pc(131) int local131 = this.aClass2_Sub11_4.aByteArray128.length - this.aClass2_Sub11_4.anInt10066;
			local46 = this.aClass2_Sub11_3.aByteArray128.length - this.aClass2_Sub11_3.anInt10066;
			if (local131 < local46) {
				this.aClass2_Sub11_3.method8385(this.aClass2_Sub11_4.anInt10066, local131, this.aClass2_Sub11_4.aByteArray128);
				this.aClass2_Sub11_4.aByteArray128 = null;
				return arg0.length;
			}
			this.aClass2_Sub11_4.method8376(local46, this.aClass2_Sub11_3.anInt10066, this.aClass2_Sub11_3.aByteArray128);
			this.aClass2_Sub11_3.anInt10066 = 0;
			this.aClass2_Sub11_3.aByteArray128 = null;
			this.anInt8342++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray20[local52] = this.aByteArrayArray20[local52 + 1];
			}
			this.aByteArrayArray20[9] = null;
		} while (this.anInt8342 < this.anIntArray547.length);
		this.aClass2_Sub11_4.aByteArray128 = null;
		return this.aClass2_Sub11_4.anInt10066;
	}
}
