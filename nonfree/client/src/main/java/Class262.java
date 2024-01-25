import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class262 {

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!tb;")
	private final Class313 aClass313_42 = new Class313(64);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_131;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
	public final int anInt7191;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class262(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_131 = arg2;
		this.anInt7191 = this.aClass259_131.method5969(19);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lclient!iga;")
	public Class157 method6032(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_42;
		@Pc(16) Class157 local16;
		synchronized (this.aClass313_42) {
			local16 = (Class157) this.aClass313_42.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) Class259 local42 = this.aClass259_131;
		@Pc(51) byte[] local51;
		synchronized (this.aClass259_131) {
			local51 = this.aClass259_131.method5985(arg0, 19);
		}
		local16 = new Class157();
		if (local51 != null) {
			local16.method3490(new Class2_Sub15(local51));
		}
		@Pc(73) Class313 local73 = this.aClass313_42;
		synchronized (this.aClass313_42) {
			this.aClass313_42.method6980((long) arg0, local16);
			return local16;
		}
	}
}
