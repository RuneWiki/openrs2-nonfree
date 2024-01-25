import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class156 {

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_48 = new Class307(256);

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_7;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!jca;Lclient!d;)V")
	public Class156(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass22_Sub2_7 = arg0;
		this.anInterface4_4 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	public void method3431() {
		this.aClass307_48.method7006();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	public void method3432() {
		this.aClass307_48.method6995(5);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)Lclient!pt;")
	public Interface16 method3434(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass307_48.method7002((long) arg0);
		if (local12 != null) {
			return (Interface16) local12;
		} else if (this.anInterface4_4.method5758(arg0)) {
			@Pc(40) Class406 local40 = this.anInterface4_4.method5761(arg0);
			@Pc(50) int local50 = local40.aBoolean762 ? 64 : this.aClass22_Sub2_7.anInt10485;
			@Pc(88) Interface16 local88;
			if (local40.aBoolean763 && this.aClass22_Sub2_7.method9332()) {
				@Pc(69) float[] local69 = this.anInterface4_4.method5762(local50, 0.7F, local50, arg0);
				local88 = this.aClass22_Sub2_7.method8919(local40.aByte148 != 0, Static646.aClass335_14, local69, local50, local50);
			} else {
				@Pc(117) int[] local117;
				if (local40.anInt11143 != 2 && Static263.method3737(local40.aByte149)) {
					local117 = this.anInterface4_4.method5760(local50, local50, true, 0.7F, arg0);
				} else {
					local117 = this.anInterface4_4.method5757(local50, local50, arg0, 0.7F);
				}
				local88 = this.aClass22_Sub2_7.method8950(local117, local50, local50, local40.aByte148 != 0);
			}
			local88.method8248(local40.aBoolean766, local40.aBoolean759);
			this.aClass307_48.method7000(local88, (long) arg0);
			return local88;
		} else {
			return null;
		}
	}
}
