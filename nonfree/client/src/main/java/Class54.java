import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class54 {

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!of;")
	private final Class188 aClass188_12 = new Class188(64);

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "Lclient!of;")
	public final Class188 aClass188_13 = new Class188(50);

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "Lclient!of;")
	public final Class188 aClass188_14 = new Class188(5);

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!pr;")
	public final Class200 aClass200_2;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Lclient!mn;")
	public final Class171 aClass171_17;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Lclient!mn;")
	private final Class171 aClass171_18;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!pr;IZLclient!mn;Lclient!mn;)V")
	public Class54(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aBoolean66 = arg2;
		this.aClass200_2 = arg0;
		this.aClass171_17 = arg4;
		this.aClass171_18 = arg3;
		if (this.aClass171_18 != null) {
			@Pc(41) int local41 = this.aClass171_18.method3677() - 1;
			this.aClass171_18.method3662(local41);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public void method1123() {
		@Pc(6) Class188 local6 = this.aClass188_12;
		synchronized (this.aClass188_12) {
			this.aClass188_12.method4154();
		}
		local6 = this.aClass188_13;
		synchronized (this.aClass188_13) {
			this.aClass188_13.method4154();
		}
		local6 = this.aClass188_14;
		synchronized (this.aClass188_14) {
			this.aClass188_14.method4154();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	public void method1124() {
		@Pc(6) Class188 local6 = this.aClass188_13;
		synchronized (this.aClass188_13) {
			this.aClass188_13.method4156();
		}
		local6 = this.aClass188_14;
		synchronized (this.aClass188_14) {
			this.aClass188_14.method4156();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1127() {
		@Pc(6) Class188 local6 = this.aClass188_12;
		synchronized (this.aClass188_12) {
			this.aClass188_12.method4156();
		}
		local6 = this.aClass188_13;
		synchronized (this.aClass188_13) {
			this.aClass188_13.method4156();
		}
		local6 = this.aClass188_14;
		synchronized (this.aClass188_14) {
			this.aClass188_14.method4156();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lclient!fm;")
	public Class82 method1128(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_12;
		@Pc(23) Class82 local23;
		synchronized (this.aClass188_12) {
			local23 = (Class82) this.aClass188_12.method4158((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class171 local36 = this.aClass171_18;
		@Pc(49) byte[] local49;
		synchronized (this.aClass171_18) {
			local49 = this.aClass171_18.method3658(Static365.method3532(arg0), Static109.method1802(arg0));
		}
		local23 = new Class82();
		local23.anInt1947 = arg0;
		local23.aClass54_1 = this;
		if (local49 != null) {
			local23.method1886(new Class2_Sub17(local49));
		}
		local23.method1895();
		@Pc(80) Class188 local80 = this.aClass188_12;
		synchronized (this.aClass188_12) {
			this.aClass188_12.method4155((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
	public void method1129() {
		@Pc(6) Class188 local6 = this.aClass188_12;
		synchronized (this.aClass188_12) {
			this.aClass188_12.method4169(5);
		}
		local6 = this.aClass188_13;
		synchronized (this.aClass188_13) {
			this.aClass188_13.method4169(5);
		}
		local6 = this.aClass188_14;
		synchronized (this.aClass188_14) {
			this.aClass188_14.method4169(5);
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZI)V")
	public void method1130(@OriginalArg(1) int arg0) {
		this.anInt1233 = arg0;
		@Pc(9) Class188 local9 = this.aClass188_13;
		synchronized (this.aClass188_13) {
			this.aClass188_13.method4156();
		}
		local9 = this.aClass188_14;
		synchronized (this.aClass188_14) {
			this.aClass188_14.method4156();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V")
	public void method1131(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean66) {
			this.aBoolean66 = arg0;
			this.method1127();
		}
	}
}
