import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class5_Sub3_Sub19 extends Class5_Sub3 {

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!rda;")
	private Class300 aClass300_46;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
	public String method8403(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass300_46 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub11 local16 = (Class5_Sub11) this.aClass300_46.method7188((long) arg0);
			return local16 == null ? arg1 : local16.aString8;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLclient!mc;)V")
	private void method8405(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method7816();
		@Pc(27) int local27;
		if (this.aClass300_46 == null) {
			local27 = Static67.method917(local20);
			this.aClass300_46 = new Class300(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(47) boolean local47 = arg1.method7816() == 1;
			@Pc(51) int local51 = arg1.method7807();
			@Pc(60) Class5 local60;
			if (local47) {
				local60 = new Class5_Sub11(arg1.method7847());
			} else {
				local60 = new Class5_Sub47(arg1.method7804());
			}
			this.aClass300_46.method7191(local60, (long) local51);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!mc;)V")
	public void method8406(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method8405(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)I")
	public int method8407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass300_46 == null) {
			return arg0;
		} else {
			@Pc(24) Class5_Sub47 local24 = (Class5_Sub47) this.aClass300_46.method7188((long) arg1);
			return local24 == null ? arg0 : local24.anInt8308;
		}
	}
}
