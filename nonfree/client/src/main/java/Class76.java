import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class76 {

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
	public int anInt1910;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!nga;")
	private final Class233 aClass233_9 = new Class233(64);

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "Lclient!nga;")
	public final Class233 aClass233_10 = new Class233(50);

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!nga;")
	public final Class233 aClass233_11 = new Class233(5);

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Lclient!cw;")
	public final Class63 aClass63_3;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!eq;")
	public final Class97 aClass97_23;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_22;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!cw;IZLclient!eq;Lclient!eq;)V")
	public Class76(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) Class97 arg4) {
		this.aClass63_3 = arg0;
		this.aBoolean162 = arg2;
		this.aClass97_23 = arg4;
		this.aClass97_22 = arg3;
		if (this.aClass97_22 != null) {
			@Pc(41) int local41 = this.aClass97_22.method2546() - 1;
			this.aClass97_22.method2569(local41);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public void method1670() {
		@Pc(2) Class233 local2 = this.aClass233_10;
		synchronized (this.aClass233_10) {
			this.aClass233_10.method5663();
		}
		local2 = this.aClass233_11;
		synchronized (this.aClass233_11) {
			this.aClass233_11.method5663();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	public void method1671() {
		@Pc(2) Class233 local2 = this.aClass233_9;
		synchronized (this.aClass233_9) {
			this.aClass233_9.method5665();
		}
		local2 = this.aClass233_10;
		synchronized (this.aClass233_10) {
			this.aClass233_10.method5665();
		}
		local2 = this.aClass233_11;
		synchronized (this.aClass233_11) {
			this.aClass233_11.method5665();
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
	public void method1673() {
		@Pc(8) Class233 local8 = this.aClass233_9;
		synchronized (this.aClass233_9) {
			this.aClass233_9.method5663();
		}
		local8 = this.aClass233_10;
		synchronized (this.aClass233_10) {
			this.aClass233_10.method5663();
		}
		local8 = this.aClass233_11;
		synchronized (this.aClass233_11) {
			this.aClass233_11.method5663();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	public void method1674() {
		@Pc(2) Class233 local2 = this.aClass233_9;
		synchronized (this.aClass233_9) {
			this.aClass233_9.method5664(5);
		}
		local2 = this.aClass233_10;
		synchronized (this.aClass233_10) {
			this.aClass233_10.method5664(5);
		}
		local2 = this.aClass233_11;
		synchronized (this.aClass233_11) {
			this.aClass233_11.method5664(5);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)V")
	public void method1675(@OriginalArg(1) int arg0) {
		this.anInt1910 = arg0;
		@Pc(15) Class233 local15 = this.aClass233_10;
		synchronized (this.aClass233_10) {
			this.aClass233_10.method5663();
		}
		local15 = this.aClass233_11;
		synchronized (this.aClass233_11) {
			this.aClass233_11.method5663();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lclient!np;")
	public Class236 method1676(@OriginalArg(0) int arg0) {
		@Pc(14) Class233 local14 = this.aClass233_9;
		@Pc(24) Class236 local24;
		synchronized (this.aClass233_9) {
			local24 = (Class236) this.aClass233_9.method5669((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class97 local37 = this.aClass97_22;
		@Pc(50) byte[] local50;
		synchronized (this.aClass97_22) {
			local50 = this.aClass97_22.method2545(Static73.method1373(arg0), Static90.method1584(arg0));
		}
		local24 = new Class236();
		local24.anInt6896 = arg0;
		local24.aClass76_2 = this;
		if (local50 != null) {
			local24.method5783(new Class2_Sub34(local50));
		}
		local24.method5789();
		@Pc(81) Class233 local81 = this.aClass233_9;
		synchronized (this.aClass233_9) {
			this.aClass233_9.method5662(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	public void method1677(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean162) {
			this.aBoolean162 = arg0;
			this.method1673();
		}
	}
}
