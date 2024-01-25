import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class23 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!vv;")
	public final Class376 aClass376_1 = new Class376();

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Z)V")
	public Class23(@OriginalArg(0) boolean arg0) {
		this.aBoolean35 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!maa;I)V")
	public void method476(@OriginalArg(0) Class12_Sub8 arg0) {
		@Pc(8) Class12_Sub2 local8 = arg0.aClass12_Sub2_15;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class12_Sub1[] local13 = arg0.aClass12_Sub1Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean6) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(43) Class12_Sub8 local43;
		if (this.aBoolean35) {
			for (local43 = (Class12_Sub8) this.aClass376_1.method9008(); local43 != null; local43 = (Class12_Sub8) this.aClass376_1.method9014()) {
				if (local8 == local43.aClass12_Sub2_15) {
					local43.method9143();
					Static512.method7461(local43);
				}
			}
		}
		for (local43 = (Class12_Sub8) this.aClass376_1.method9008(); local43 != null; local43 = (Class12_Sub8) this.aClass376_1.method9014()) {
			if (local8.anInt11000 >= local43.aClass12_Sub2_15.anInt11000) {
				Static625.method8783(arg0, local43);
				return;
			}
		}
		this.aClass376_1.method9011(arg0);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public void method479() {
		while (true) {
			@Pc(15) Class12_Sub8 local15 = (Class12_Sub8) this.aClass376_1.method9010();
			if (local15 == null) {
				return;
			}
			local15.method9143();
			Static512.method7461(local15);
		}
	}
}
