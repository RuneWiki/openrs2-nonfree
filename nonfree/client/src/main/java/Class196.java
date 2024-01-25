import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class196 {

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt5208;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!fc;")
	private final Class77 aClass77_38 = new Class77(64);

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!fc;")
	public final Class77 aClass77_39 = new Class77(50);

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!fc;")
	public final Class77 aClass77_40 = new Class77(5);

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!oi;")
	private final Class185 aClass185_82;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!le;")
	public final Class148 aClass148_4;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!oi;")
	public final Class185 aClass185_83;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!le;IZLclient!oi;Lclient!oi;)V")
	public Class196(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class185 arg3, @OriginalArg(4) Class185 arg4) {
		this.aClass185_82 = arg3;
		this.aClass148_4 = arg0;
		this.aClass185_83 = arg4;
		this.aBoolean469 = arg2;
		if (this.aClass185_82 != null) {
			@Pc(41) int local41 = this.aClass185_82.method4010() - 1;
			this.aClass185_82.method4011(local41);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!wr;")
	public Class272 method4163(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_38;
		@Pc(16) Class272 local16;
		synchronized (this.aClass77_38) {
			local16 = (Class272) this.aClass77_38.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_82;
		@Pc(42) byte[] local42;
		synchronized (this.aClass185_82) {
			local42 = this.aClass185_82.method4002(Static10.method4089(arg0), Static130.method1648(arg0));
		}
		local16 = new Class272();
		local16.aClass196_2 = this;
		local16.anInt7325 = arg0;
		if (local42 != null) {
			local16.method5906(new Class1_Sub19(local42));
		}
		local16.method5898();
		@Pc(80) Class77 local80 = this.aClass77_38;
		synchronized (this.aClass77_38) {
			this.aClass77_38.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method4164() {
		@Pc(2) Class77 local2 = this.aClass77_38;
		synchronized (this.aClass77_38) {
			this.aClass77_38.method1394();
		}
		local2 = this.aClass77_39;
		synchronized (this.aClass77_39) {
			this.aClass77_39.method1394();
		}
		local2 = this.aClass77_40;
		synchronized (this.aClass77_40) {
			this.aClass77_40.method1394();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	public void method4165() {
		@Pc(2) Class77 local2 = this.aClass77_38;
		synchronized (this.aClass77_38) {
			this.aClass77_38.method1386(5);
		}
		local2 = this.aClass77_39;
		synchronized (this.aClass77_39) {
			this.aClass77_39.method1386(5);
		}
		local2 = this.aClass77_40;
		synchronized (this.aClass77_40) {
			this.aClass77_40.method1386(5);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public void method4166() {
		@Pc(6) Class77 local6 = this.aClass77_39;
		synchronized (this.aClass77_39) {
			this.aClass77_39.method1395();
		}
		local6 = this.aClass77_40;
		synchronized (this.aClass77_40) {
			this.aClass77_40.method1395();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	public void method4167(@OriginalArg(0) int arg0) {
		this.anInt5208 = arg0;
		@Pc(9) Class77 local9 = this.aClass77_39;
		synchronized (this.aClass77_39) {
			this.aClass77_39.method1395();
		}
		local9 = this.aClass77_40;
		synchronized (this.aClass77_40) {
			this.aClass77_40.method1395();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public void method4168() {
		@Pc(2) Class77 local2 = this.aClass77_38;
		synchronized (this.aClass77_38) {
			this.aClass77_38.method1395();
		}
		@Pc(29) Class77 local29 = this.aClass77_39;
		synchronized (this.aClass77_39) {
			this.aClass77_39.method1395();
		}
		local29 = this.aClass77_40;
		synchronized (this.aClass77_40) {
			this.aClass77_40.method1395();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public void method4170(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean469 != arg0) {
			this.aBoolean469 = arg0;
			this.method4168();
		}
	}
}
