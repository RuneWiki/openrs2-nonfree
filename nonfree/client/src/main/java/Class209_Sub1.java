import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class209_Sub1 extends Class209 {

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
	private int anInt5188;

	@OriginalMember(owner = "client!ll", name = "O", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[10][];

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "Lclient!vj;")
	private final Class2_Sub22 aClass2_Sub22_7 = new Class2_Sub22(null);

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "Lclient!vj;")
	private final Class2_Sub22 aClass2_Sub22_8 = new Class2_Sub22(null);

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
	private final int anInt5184;

	@OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lclient!wu;")
	private final Class380 aClass380_81;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(ILclient!wu;I)V")
	public Class209_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt5184 = arg2;
		this.aClass380_81 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(Z)V")
	public void method4372() {
		if (this.anIntArray360 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anIntArray360.length <= this.anInt5188 + local15) {
				return;
			}
			if (this.aByteArrayArray14[local15] == null && this.aClass380_81.method8619(this.anIntArray360[local15 + this.anInt5188], 0)) {
				this.aByteArrayArray14[local15] = this.aClass380_81.method8620(this.anIntArray360[local15 + this.anInt5188], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method4367(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray360 == null) {
			if (!this.aClass380_81.method8619(this.anInt5184, 0)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass380_81.method8620(this.anInt5184, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub22_8.anInt10247 = 0;
			this.aClass2_Sub22_8.aByteArray115 = local26;
			local46 = local26.length >> 1;
			this.anIntArray360 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray360[local52] = this.aClass2_Sub22_8.method8546();
			}
		}
		if (this.anIntArray360.length <= this.anInt5188) {
			return -1;
		}
		this.method4372();
		this.aClass2_Sub22_8.anInt10247 = 0;
		this.aClass2_Sub22_8.aByteArray115 = arg0;
		do {
			if (this.aClass2_Sub22_8.aByteArray115.length <= this.aClass2_Sub22_8.anInt10247) {
				this.aClass2_Sub22_8.aByteArray115 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub22_7.aByteArray115 == null) {
				if (this.aByteArrayArray14[0] == null) {
					this.aClass2_Sub22_8.aByteArray115 = null;
					return this.aClass2_Sub22_8.anInt10247;
				}
				this.aClass2_Sub22_7.aByteArray115 = this.aByteArrayArray14[0];
			}
			@Pc(137) int local137 = this.aClass2_Sub22_8.aByteArray115.length - this.aClass2_Sub22_8.anInt10247;
			local46 = this.aClass2_Sub22_7.aByteArray115.length - this.aClass2_Sub22_7.anInt10247;
			if (local46 > local137) {
				this.aClass2_Sub22_7.method8502(this.aClass2_Sub22_8.aByteArray115, this.aClass2_Sub22_8.anInt10247, local137);
				this.aClass2_Sub22_8.aByteArray115 = null;
				return arg0.length;
			}
			this.aClass2_Sub22_8.method8508(this.aClass2_Sub22_7.anInt10247, local46, this.aClass2_Sub22_7.aByteArray115);
			this.aClass2_Sub22_7.anInt10247 = 0;
			this.aClass2_Sub22_7.aByteArray115 = null;
			this.anInt5188++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray14[local52] = this.aByteArrayArray14[local52 + 1];
			}
			this.aByteArrayArray14[9] = null;
		} while (this.anInt5188 < this.anIntArray360.length);
		this.aClass2_Sub22_8.aByteArray115 = null;
		return this.aClass2_Sub22_8.anInt10247;
	}
}
