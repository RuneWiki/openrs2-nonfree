import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class270 {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!hv;")
	public final Class156 aClass156_6 = new Class156();

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "Z")
	public boolean aBoolean649 = false;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Z)V")
	public Class270(@OriginalArg(0) boolean arg0) {
		this.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method6361(@OriginalArg(0) Class28_Sub7 arg0) {
		@Pc(8) Class28_Sub1 local8 = arg0.aClass28_Sub1_17;
		@Pc(14) boolean local14 = true;
		@Pc(17) Class28_Sub9[] local17 = arg0.aClass28_Sub9Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			if (local17[local19].aBoolean890) {
				local14 = false;
				break;
			}
		}
		if (local14) {
			return;
		}
		@Pc(53) Class28_Sub7 local53;
		if (this.aBoolean649) {
			for (local53 = (Class28_Sub7) this.aClass156_6.method3776(); local53 != null; local53 = (Class28_Sub7) this.aClass156_6.method3783()) {
				if (local8 == local53.aClass28_Sub1_17) {
					local53.method9022();
					Static334.method5129(local53);
				}
			}
		}
		for (local53 = (Class28_Sub7) this.aClass156_6.method3776(); local53 != null; local53 = (Class28_Sub7) this.aClass156_6.method3783()) {
			if (local8.anInt10777 >= local53.aClass28_Sub1_17.anInt10777) {
				Static489.method7017(arg0, local53);
				return;
			}
		}
		this.aClass156_6.method3774(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	public void method6362() {
		while (true) {
			@Pc(12) Class28_Sub7 local12 = (Class28_Sub7) this.aClass156_6.method3775();
			if (local12 == null) {
				return;
			}
			local12.method9022();
			Static334.method5129(local12);
		}
	}
}
