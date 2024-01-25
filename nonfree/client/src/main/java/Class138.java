import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class138 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!iha;")
	private final Class168 aClass168_32 = new Class168(256);

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_9;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_6;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!gca;Lclient!d;)V")
	public Class138(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass100_Sub1_9 = arg0;
		this.anInterface7_6 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method3295() {
		this.aClass168_32.method3852(5);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lclient!ah;")
	public Interface2 method3297(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass168_32.method3860((long) arg0);
		if (local12 != null) {
			return (Interface2) local12;
		} else if (this.anInterface7_6.method7421(arg0)) {
			@Pc(33) Class44 local33 = this.anInterface7_6.method7423(arg0);
			@Pc(43) int local43 = local33.aBoolean62 ? 64 : this.aClass100_Sub1_9.anInt9235;
			@Pc(78) Interface2 local78;
			if (local33.aBoolean57 && this.aClass100_Sub1_9.method8656()) {
				@Pc(62) float[] local62 = this.anInterface7_6.method7422(local43, arg0, 0.7F, local43);
				local78 = this.aClass100_Sub1_9.method7984(Static171.aClass358_12, local43, local62, local43, local33.aByte21 != 0);
			} else {
				@Pc(105) int[] local105;
				if (local33.anInt809 != 2 && Static662.method9084(local33.aByte23)) {
					local105 = this.anInterface7_6.method7424(local43, true, local43, arg0, 0.7F);
				} else {
					local105 = this.anInterface7_6.method7419(arg0, 0.7F, local43, local43);
				}
				local78 = this.aClass100_Sub1_9.method7875(local33.aByte21 != 0, local43, local105, local43);
			}
			local78.method3687(local33.aBoolean63, local33.aBoolean60);
			this.aClass168_32.method3853((long) arg0, local78);
			return local78;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method3298() {
		this.aClass168_32.method3862();
	}
}
