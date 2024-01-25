import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class52 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!re;")
	public final Class320 aClass320_1 = new Class320();

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Z)V")
	public Class52(@OriginalArg(0) boolean arg0) {
		this.aBoolean139 = arg0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method1068(@OriginalArg(1) Class4_Sub8 arg0) {
		@Pc(8) Class4_Sub2 local8 = arg0.aClass4_Sub2_13;
		@Pc(10) boolean local10 = true;
		@Pc(13) Class4_Sub6[] local13 = arg0.aClass4_Sub6Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].aBoolean269) {
				local10 = false;
				break;
			}
		}
		if (local10) {
			return;
		}
		@Pc(55) Class4_Sub8 local55;
		if (this.aBoolean139) {
			for (local55 = (Class4_Sub8) this.aClass320_1.method7605(); local55 != null; local55 = (Class4_Sub8) this.aClass320_1.method7608()) {
				if (local55.aClass4_Sub2_13 == local8) {
					local55.method9416();
					Static525.method7392(local55);
				}
			}
		}
		for (local55 = (Class4_Sub8) this.aClass320_1.method7605(); local55 != null; local55 = (Class4_Sub8) this.aClass320_1.method7608()) {
			if (local55.aClass4_Sub2_13.anInt10233 <= local8.anInt10233) {
				Static243.method3437(local55, arg0);
				return;
			}
		}
		this.aClass320_1.method7600(arg0);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	public void method1069() {
		while (true) {
			@Pc(14) Class4_Sub8 local14 = (Class4_Sub8) this.aClass320_1.method7604();
			if (local14 == null) {
				return;
			}
			local14.method9416();
			Static525.method7392(local14);
		}
	}
}
