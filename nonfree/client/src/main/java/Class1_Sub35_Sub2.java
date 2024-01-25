import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class1_Sub35_Sub2 extends Class1_Sub35 {

	@OriginalMember(owner = "client!qaa", name = "Lb", descriptor = "I")
	private int anInt7277;

	@OriginalMember(owner = "client!qaa", name = "Qb", descriptor = "Lclient!qm;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub35_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(BI)I")
	public int method5806(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt7277 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt7277 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt7277 += arg0;
		while (local18 < arg0) {
			local20 += (super.aByteArray85[local10++] & Static203.anIntArray323[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static203.anIntArray323[local18] & super.aByteArray85[local10];
		} else {
			local20 += super.aByteArray85[local10] >> local18 - arg0 & Static203.anIntArray323[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!qaa", name = "m", descriptor = "(B)I")
	public int method5807() {
		@Pc(29) int local29 = super.aByteArray85[super.anInt7214++] - this.aClass276_1.method6031() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray85[super.anInt7214++] - this.aClass276_1.method6031() & 0xFF);
	}

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "(BI)I")
	public int method5808(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt7277;
	}

	@OriginalMember(owner = "client!qaa", name = "p", descriptor = "(I)V")
	public void method5809() {
		this.anInt7277 = super.anInt7214 * 8;
	}

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "(BI)V")
	public void method5813(@OriginalArg(1) int arg0) {
		super.aByteArray85[super.anInt7214++] = (byte) (this.aClass276_1.method6031() + arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "s", descriptor = "(I)V")
	public void method5814() {
		super.anInt7214 = (this.anInt7277 + 7) / 8;
	}

	@OriginalMember(owner = "client!qaa", name = "t", descriptor = "(I)Z")
	public boolean method5815() {
		@Pc(21) int local21 = super.aByteArray85[super.anInt7214] - this.aClass276_1.method6032() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!qm;)V")
	public void method5816(@OriginalArg(1) Class276 arg0) {
		this.aClass276_1 = arg0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[I)V")
	public void method5817(@OriginalArg(1) int[] arg0) {
		this.aClass276_1 = new Class276(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([BIIB)V")
	public void method5819(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray85[super.anInt7214++] - this.aClass276_1.method6031());
		}
	}
}
