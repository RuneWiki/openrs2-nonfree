import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class111 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public int anInt3550 = 0;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	public int anInt3552 = 0;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!nga;")
	private final Class233 aClass233_14 = new Class233(64);

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!oha;")
	private Interface15 anInterface15_1 = null;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!eq;")
	private final Class97 aClass97_39;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_40;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ILclient!eq;Lclient!eq;Lclient!oha;)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) Interface15 arg3) {
		this.aClass97_39 = arg1;
		this.aClass97_40 = arg2;
		this.anInterface15_1 = arg3;
		if (this.aClass97_39 != null) {
			this.anInt3550 = this.aClass97_39.method2569(1);
		}
		if (this.aClass97_40 != null) {
			this.anInt3552 = this.aClass97_40.method2569(1);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI[ILclient!qca;)Ljava/lang/String;")
	public String method2927(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class271 arg2) {
		if (this.anInterface15_1 != null) {
			@Pc(22) String local22 = this.anInterface15_1.method3858(arg2, arg0, arg1);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!om;")
	public Class2_Sub5_Sub17 method2928(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub5_Sub17 local11 = (Class2_Sub5_Sub17) this.aClass233_14.method5669((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = this.aClass97_39.method2545(arg0, 1);
		} else {
			local29 = this.aClass97_40.method2545(arg0 & 0x7FFF, 1);
		}
		local11 = new Class2_Sub5_Sub17();
		local11.aClass111_2 = this;
		if (local29 != null) {
			local11.method6304(new Class2_Sub34(local29));
		}
		if (arg0 >= 32768) {
			local11.method6306();
		}
		this.aClass233_14.method5662(local11, (long) arg0);
		return local11;
	}
}
