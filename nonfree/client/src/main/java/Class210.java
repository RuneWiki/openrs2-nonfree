import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class210 {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!si;")
	private final Class338 aClass338_30 = new Class338(256);

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_7;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_23;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!gia;Lclient!d;)V")
	public Class210(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_7 = arg1;
		this.aClass67_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method4992() {
		this.aClass338_30.method8051();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public void method4995() {
		this.aClass338_30.method8052(5);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Lclient!nw;")
	public Class245_Sub2 method4996(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass338_30.method8049((long) arg0);
		if (local12 != null) {
			return (Class245_Sub2) local12;
		} else if (this.anInterface2_7.method1024(arg0)) {
			@Pc(35) Class32 local35 = this.anInterface2_7.method1027(arg0);
			@Pc(45) int local45 = local35.aBoolean71 ? 64 : this.aClass67_Sub2_23.anInt3870;
			@Pc(88) Class245_Sub2 local88;
			if (local35.aBoolean66 && this.aClass67_Sub2_23.method7643()) {
				@Pc(66) float[] local66 = this.anInterface2_7.method1029(0.7F, local45, local45, arg0);
				local88 = new Class245_Sub2(this.aClass67_Sub2_23, 3553, 34842, local45, local45, local35.aByte21 != 0, local66, 6408);
			} else {
				@Pc(115) int[] local115;
				if (local35.anInt861 != 2 && Static627.method8496(local35.aByte25)) {
					local115 = this.anInterface2_7.method1025(local45, local45, 0.7F, arg0, true);
				} else {
					local115 = this.anInterface2_7.method1026(0.7F, local45, local45, arg0);
				}
				local88 = new Class245_Sub2(this.aClass67_Sub2_23, 3553, 6408, local45, local45, local35.aByte21 != 0, local115, 0, 0, false);
			}
			local88.method8473(local35.aBoolean64, local35.aBoolean68);
			this.aClass338_30.method8044((long) arg0, local88);
			return local88;
		} else {
			return null;
		}
	}
}
