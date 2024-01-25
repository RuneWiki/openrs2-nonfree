import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class226 {

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
	public int anInt6644;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "Lclient!vh;")
	private final Class330 aClass330_38 = new Class330(64);

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "Lclient!vh;")
	public final Class330 aClass330_39 = new Class330(50);

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "Lclient!vh;")
	public final Class330 aClass330_40 = new Class330(5);

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "Lclient!pj;")
	private final Class248 aClass248_61;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "Lclient!dd;")
	public final Class68 aClass68_5;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Lclient!pj;")
	public final Class248 aClass248_62;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!dd;IZLclient!pj;Lclient!pj;)V")
	public Class226(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) Class248 arg4) {
		this.aClass248_61 = arg3;
		this.aClass68_5 = arg0;
		this.aClass248_62 = arg4;
		this.aBoolean462 = arg2;
		if (this.aClass248_61 != null) {
			@Pc(41) int local41 = this.aClass248_61.method5774() - 1;
			this.aClass248_61.method5793(local41);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public void method5366() {
		@Pc(2) Class330 local2 = this.aClass330_39;
		synchronized (this.aClass330_39) {
			this.aClass330_39.method7688();
		}
		local2 = this.aClass330_40;
		synchronized (this.aClass330_40) {
			this.aClass330_40.method7688();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZZ)V")
	public void method5367(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean462 != arg0) {
			this.aBoolean462 = arg0;
			this.method5368();
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	public void method5368() {
		@Pc(2) Class330 local2 = this.aClass330_38;
		synchronized (this.aClass330_38) {
			this.aClass330_38.method7688();
		}
		local2 = this.aClass330_39;
		synchronized (this.aClass330_39) {
			this.aClass330_39.method7688();
		}
		local2 = this.aClass330_40;
		synchronized (this.aClass330_40) {
			this.aClass330_40.method7688();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Lclient!ei;")
	public Class88 method5369(@OriginalArg(0) int arg0) {
		@Pc(11) Class330 local11 = this.aClass330_38;
		@Pc(21) Class88 local21;
		synchronized (this.aClass330_38) {
			local21 = (Class88) this.aClass330_38.method7677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class248 local34 = this.aClass248_61;
		@Pc(49) byte[] local49;
		synchronized (this.aClass248_61) {
			local49 = this.aClass248_61.method5797(Static289.method4391(arg0), Static383.method5607(arg0));
		}
		local21 = new Class88();
		local21.aClass226_2 = this;
		local21.anInt2167 = arg0;
		if (local49 != null) {
			local21.method1941(new Class6_Sub12(local49));
		}
		local21.method1945();
		@Pc(80) Class330 local80 = this.aClass330_38;
		synchronized (this.aClass330_38) {
			this.aClass330_38.method7676(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(IB)V")
	public void method5370() {
		@Pc(6) Class330 local6 = this.aClass330_38;
		synchronized (this.aClass330_38) {
			this.aClass330_38.method7680(5);
		}
		local6 = this.aClass330_39;
		synchronized (this.aClass330_39) {
			this.aClass330_39.method7680(5);
		}
		local6 = this.aClass330_40;
		synchronized (this.aClass330_40) {
			this.aClass330_40.method7680(5);
		}
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
	public void method5372() {
		@Pc(6) Class330 local6 = this.aClass330_38;
		synchronized (this.aClass330_38) {
			this.aClass330_38.method7678();
		}
		local6 = this.aClass330_39;
		synchronized (this.aClass330_39) {
			this.aClass330_39.method7678();
		}
		local6 = this.aClass330_40;
		synchronized (this.aClass330_40) {
			this.aClass330_40.method7678();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)V")
	public void method5375(@OriginalArg(1) int arg0) {
		this.anInt6644 = arg0;
		@Pc(17) Class330 local17 = this.aClass330_39;
		synchronized (this.aClass330_39) {
			this.aClass330_39.method7688();
		}
		local17 = this.aClass330_40;
		synchronized (this.aClass330_40) {
			this.aClass330_40.method7688();
		}
	}
}
