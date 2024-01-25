import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "Lclient!qr;")
	private Class306 aClass306_44;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method8192(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass306_44 == null) {
			return arg0;
		} else {
			@Pc(27) Class5_Sub46 local27 = (Class5_Sub46) this.aClass306_44.method6943((long) arg1);
			return local27 == null ? arg0 : local27.aString87;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!wq;)V")
	public void method8193(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7291();
			if (local9 == 0) {
				return;
			}
			this.method8196(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)I")
	public int method8195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass306_44 == null) {
			return arg0;
		} else {
			@Pc(23) Class5_Sub43 local23 = (Class5_Sub43) this.aClass306_44.method6943((long) arg1);
			return local23 == null ? arg0 : local23.anInt6989;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILclient!wq;)V")
	private void method8196(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(17) int local17 = arg1.method7291();
		@Pc(24) int local24;
		if (this.aClass306_44 == null) {
			local24 = Static146.method2737(local17);
			this.aClass306_44 = new Class306(local24);
		}
		for (local24 = 0; local24 < local17; local24++) {
			@Pc(48) boolean local48 = arg1.method7291() == 1;
			@Pc(52) int local52 = arg1.method7331();
			@Pc(61) Class5 local61;
			if (local48) {
				local61 = new Class5_Sub46(arg1.method7281());
			} else {
				local61 = new Class5_Sub43(arg1.method7268());
			}
			this.aClass306_44.method6944(local61, (long) local52, -12002);
		}
	}
}
