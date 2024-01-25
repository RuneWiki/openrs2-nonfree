import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!tga;")
	private Class335 aClass335_46;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)I")
	public int method8544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_46 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub43 local16 = (Class5_Sub43) this.aClass335_46.method7766((long) arg0);
			return local16 == null ? arg1 : local16.anInt7821;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!rv;)V")
	public void method8545(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			this.method8546(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!rv;ZI)V")
	private void method8546(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method3642();
		@Pc(17) int local17;
		if (this.aClass335_46 == null) {
			local17 = Static209.method2991(local10);
			this.aClass335_46 = new Class335(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(37) boolean local37 = arg0.method3642() == 1;
			@Pc(41) int local41 = arg0.method3633();
			@Pc(50) Class5 local50;
			if (local37) {
				local50 = new Class5_Sub44(arg0.method3661());
			} else {
				local50 = new Class5_Sub43(arg0.method3671());
			}
			this.aClass335_46.method7770((long) local41, local50);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;")
	public String method8547(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass335_46 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub44 local16 = (Class5_Sub44) this.aClass335_46.method7766((long) arg0);
			return local16 == null ? arg1 : local16.aString83;
		}
	}
}
