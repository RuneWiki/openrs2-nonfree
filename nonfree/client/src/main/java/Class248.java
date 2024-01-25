import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class248 {

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
	public int anInt6548;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
	public boolean aBoolean569 = false;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!fc;")
	private Class77 aClass77_55 = new Class77(64);

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!fc;")
	public final Class77 aClass77_56 = new Class77(500);

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Lclient!fc;")
	public final Class77 aClass77_57 = new Class77(30);

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "Lclient!fc;")
	public final Class77 aClass77_58 = new Class77(50);

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Z")
	public boolean aBoolean570;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!oi;")
	private final Class185 aClass185_108;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!oi;")
	public final Class185 aClass185_109;

	static {
		new Class142("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!le;IZLclient!oi;Lclient!oi;)V")
	public Class248(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class185 arg3, @OriginalArg(4) Class185 arg4) {
		this.aBoolean570 = arg2;
		this.aClass185_108 = arg3;
		this.aClass185_109 = arg4;
		if (this.aClass185_108 != null) {
			@Pc(47) int local47 = this.aClass185_108.method4010() - 1;
			this.aClass185_108.method4011(local47);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZB)V")
	public void method5244(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean569) {
			this.aBoolean569 = arg0;
			this.method5252();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lclient!fu;")
	public Class87 method5246(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_55;
		@Pc(16) Class87 local16;
		synchronized (this.aClass77_55) {
			local16 = (Class87) this.aClass77_55.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class185 local35 = this.aClass185_108;
		@Pc(48) byte[] local48;
		synchronized (this.aClass185_108) {
			local48 = this.aClass185_108.method4002(Static418.method5348(arg0), Static416.method5324(arg0));
		}
		local16 = new Class87();
		local16.aClass248_3 = this;
		local16.anInt1925 = arg0;
		if (local48 != null) {
			local16.method1575(new Class1_Sub19(local48));
		}
		local16.method1568();
		if (!this.aBoolean570 && local16.aBoolean210) {
			local16.anIntArray168 = null;
			local16.aStringArray11 = null;
		}
		if (local16.aBoolean201) {
			local16.aBoolean215 = false;
			local16.lb = 0;
		}
		@Pc(100) Class77 local100 = this.aClass77_55;
		synchronized (this.aClass77_55) {
			this.aClass77_55.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	public void method5247(@OriginalArg(1) int arg0) {
		this.anInt6548 = arg0;
		@Pc(9) Class77 local9 = this.aClass77_56;
		synchronized (this.aClass77_56) {
			this.aClass77_56.method1395();
		}
		local9 = this.aClass77_57;
		synchronized (this.aClass77_57) {
			this.aClass77_57.method1395();
		}
		local9 = this.aClass77_58;
		synchronized (this.aClass77_58) {
			this.aClass77_58.method1395();
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V")
	public void method5248() {
		@Pc(2) Class77 local2 = this.aClass77_55;
		synchronized (this.aClass77_55) {
			this.aClass77_55.method1386(5);
		}
		local2 = this.aClass77_56;
		synchronized (this.aClass77_56) {
			this.aClass77_56.method1386(5);
		}
		local2 = this.aClass77_57;
		synchronized (this.aClass77_57) {
			this.aClass77_57.method1386(5);
		}
		local2 = this.aClass77_58;
		synchronized (this.aClass77_58) {
			this.aClass77_58.method1386(5);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method5249() {
		@Pc(2) Class77 local2 = this.aClass77_55;
		synchronized (this.aClass77_55) {
			this.aClass77_55.method1394();
		}
		local2 = this.aClass77_56;
		synchronized (this.aClass77_56) {
			this.aClass77_56.method1394();
		}
		local2 = this.aClass77_57;
		synchronized (this.aClass77_57) {
			this.aClass77_57.method1394();
		}
		local2 = this.aClass77_58;
		synchronized (this.aClass77_58) {
			this.aClass77_58.method1394();
		}
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)V")
	public void method5250(@OriginalArg(1) int arg0) {
		this.aClass77_55 = new Class77(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public void method5252() {
		@Pc(6) Class77 local6 = this.aClass77_55;
		synchronized (this.aClass77_55) {
			this.aClass77_55.method1395();
		}
		local6 = this.aClass77_56;
		synchronized (this.aClass77_56) {
			this.aClass77_56.method1395();
		}
		local6 = this.aClass77_57;
		synchronized (this.aClass77_57) {
			this.aClass77_57.method1395();
		}
		local6 = this.aClass77_58;
		synchronized (this.aClass77_58) {
			this.aClass77_58.method1395();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V")
	public void method5253(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean570 != arg0) {
			this.aBoolean570 = arg0;
			this.method5252();
		}
	}
}
