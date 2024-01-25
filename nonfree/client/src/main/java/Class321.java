import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class321 {

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "Lclient!vl;")
	public final Class371 aClass371_7 = new Class371();

	@OriginalMember(owner = "client!sja", name = "h", descriptor = "Z")
	public boolean aBoolean703 = false;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Z)V")
	public Class321(@OriginalArg(0) boolean arg0) {
		this.aBoolean703 = arg0;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!dfa;I)V")
	public void method7864(@OriginalArg(0) Class28_Sub3 arg0) {
		@Pc(8) Class28_Sub1 local8 = arg0.aClass28_Sub1_5;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class28_Sub8[] local13 = arg0.aClass28_Sub8Array1;
		for (@Pc(22) int local22 = 0; local22 < local13.length; local22++) {
			if (local13[local22].aBoolean716) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(56) Class28_Sub3 local56;
		if (this.aBoolean703) {
			for (local56 = (Class28_Sub3) this.aClass371_7.method8911(); local56 != null; local56 = (Class28_Sub3) this.aClass371_7.method8917()) {
				if (local8 == local56.aClass28_Sub1_5) {
					local56.method9276();
					Static519.method7297(local56);
				}
			}
		}
		for (local56 = (Class28_Sub3) this.aClass371_7.method8911(); local56 != null; local56 = (Class28_Sub3) this.aClass371_7.method8917()) {
			if (local8.anInt10726 >= local56.aClass28_Sub1_5.anInt10726) {
				Static290.method4555(local56, arg0);
				return;
			}
		}
		this.aClass371_7.method8908(arg0);
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
	public void method7867() {
		while (true) {
			@Pc(12) Class28_Sub3 local12 = (Class28_Sub3) this.aClass371_7.method8913();
			if (local12 == null) {
				return;
			}
			local12.method9276();
			Static519.method7297(local12);
		}
	}
}
