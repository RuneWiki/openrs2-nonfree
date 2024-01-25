import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class141 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!fc;")
	private final Class77 aClass77_32 = new Class77(256);

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_21;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!l;")
	private final Interface4 anInterface4_5;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ih;Lclient!l;)V")
	public Class141(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass117_Sub1_21 = arg0;
		this.anInterface4_5 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public void method3096() {
		this.aClass77_32.method1386(5);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public void method3097() {
		this.aClass77_32.method1395();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lclient!gu;")
	public Class23_Sub3 method3098(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass77_32.method1387((long) arg0);
		if (local12 != null) {
			return (Class23_Sub3) local12;
		} else if (this.anInterface4_5.method5089(arg0)) {
			@Pc(37) Class25 local37 = this.anInterface4_5.method5090(arg0);
			@Pc(46) int local46 = local37.aBoolean54 ? 64 : this.aClass117_Sub1_21.anInt3085;
			@Pc(96) Class23_Sub3 local96;
			if (local37.aBoolean58 && this.aClass117_Sub1_21.method5713()) {
				@Pc(108) float[] local108 = this.anInterface4_5.method5087(local46, 0.7F, local46, arg0);
				local96 = new Class23_Sub3(this.aClass117_Sub1_21, 3553, 34842, local46, local46, local37.aByte9 != 0, local108, 6408);
			} else {
				@Pc(66) int[] local66;
				if (local37.aBoolean53) {
					local66 = this.anInterface4_5.method5086(local46, arg0, local46, 0.7F);
				} else {
					local66 = this.anInterface4_5.method5088(local46, arg0, 0.7F, false, local46);
				}
				local96 = new Class23_Sub3(this.aClass117_Sub1_21, 3553, 6408, local46, local46, local37.aByte9 != 0, local66, false);
			}
			local96.method5808(local37.aBoolean55, local37.aBoolean59);
			this.aClass77_32.method1396(local96, (long) arg0);
			return local96;
		} else {
			return null;
		}
	}
}
