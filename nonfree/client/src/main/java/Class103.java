import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class103 {

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!lh;")
	private Class151 aClass151_62 = new Class151(128);

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Lclient!lh;")
	public Class151 aClass151_63 = new Class151(64);

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!hh;")
	private final Class109 aClass109_32;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Lclient!hh;")
	public final Class109 aClass109_33;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;Lclient!hh;)V")
	public Class103(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3) {
		this.aClass109_32 = arg2;
		this.aClass109_33 = arg3;
		this.aClass109_32.method2322(36);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)V")
	public void method2052() {
		@Pc(2) Class151 local2 = this.aClass151_62;
		synchronized (this.aClass151_62) {
			this.aClass151_62.method3297(5);
		}
		local2 = this.aClass151_63;
		synchronized (this.aClass151_63) {
			this.aClass151_63.method3297(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method2053() {
		@Pc(2) Class151 local2 = this.aClass151_62;
		synchronized (this.aClass151_62) {
			this.aClass151_62.method3298();
		}
		@Pc(29) Class151 local29 = this.aClass151_63;
		synchronized (this.aClass151_63) {
			this.aClass151_63.method3298();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V")
	public void method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass151_62 = new Class151(arg0);
		this.aClass151_63 = new Class151(arg1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lclient!db;")
	public Class52 method2055(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_62;
		@Pc(18) Class52 local18;
		synchronized (this.aClass151_62) {
			local18 = (Class52) this.aClass151_62.method3288((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass109_32.method2349(36, arg0);
		local18 = new Class52();
		local18.anInt1184 = arg0;
		local18.aClass103_1 = this;
		if (local35 != null) {
			local18.method974(new Class1_Sub14(local35));
		}
		local18.method987();
		@Pc(62) Class151 local62 = this.aClass151_62;
		synchronized (this.aClass151_62) {
			this.aClass151_62.method3291((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	public void method2056() {
		@Pc(2) Class151 local2 = this.aClass151_62;
		synchronized (this.aClass151_62) {
			this.aClass151_62.method3299();
		}
		local2 = this.aClass151_63;
		synchronized (this.aClass151_63) {
			this.aClass151_63.method3299();
		}
	}
}
