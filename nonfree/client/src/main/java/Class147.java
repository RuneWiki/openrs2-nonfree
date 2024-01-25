import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class147 {

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "Lclient!tb;")
	private final Class313 aClass313_24 = new Class313(16);

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_63;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class147(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_63 = arg2;
		this.aClass259_63.method5969(29);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
	public void method3347() {
		@Pc(6) Class313 local6 = this.aClass313_24;
		synchronized (this.aClass313_24) {
			this.aClass313_24.method6977();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!nk;IIIII)Lclient!tw;")
	public Class326 method3348(@OriginalArg(0) Class232 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class278[] local7 = null;
		@Pc(12) Class325 local12 = this.method3352(arg4);
		if (local12.anIntArray627 != null) {
			local7 = new Class278[local12.anIntArray627.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(39) Class69 local39 = arg0.method5413(local12.anIntArray627[local27]);
				local7[local27] = new Class278(local39.anInt1764, local39.anInt1763, local39.anInt1769, local39.anInt1771, local39.anInt1766, local39.anInt1772, local39.anInt1762, local39.aBoolean128);
			}
		}
		return new Class326(local12.anInt8611, local7, local12.anInt8612, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V")
	public void method3349() {
		@Pc(2) Class313 local2 = this.aClass313_24;
		synchronized (this.aClass313_24) {
			this.aClass313_24.method6983();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)V")
	public void method3351() {
		@Pc(14) Class313 local14 = this.aClass313_24;
		synchronized (this.aClass313_24) {
			this.aClass313_24.method6982(5);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!tv;")
	private Class325 method3352(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_24;
		@Pc(16) Class325 local16;
		synchronized (this.aClass313_24) {
			local16 = (Class325) this.aClass313_24.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_63;
		@Pc(38) byte[] local38;
		synchronized (this.aClass259_63) {
			local38 = this.aClass259_63.method5985(arg0, 29);
		}
		local16 = new Class325();
		if (local38 != null) {
			local16.method7193(new Class2_Sub15(local38));
		}
		@Pc(62) Class313 local62 = this.aClass313_24;
		synchronized (this.aClass313_24) {
			this.aClass313_24.method6980((long) arg0, local16);
			return local16;
		}
	}
}
