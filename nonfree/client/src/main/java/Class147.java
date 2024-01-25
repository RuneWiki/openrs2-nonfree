import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class147 {

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Lclient!of;")
	private final Class188 aClass188_35 = new Class188(16);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!mn;")
	private final Class171 aClass171_47;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class147(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_47 = arg2;
		this.aClass171_47.method3662(29);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public void method3048() {
		@Pc(11) Class188 local11 = this.aClass188_35;
		synchronized (this.aClass188_35) {
			this.aClass188_35.method4156();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!cc;IIII)Lclient!uk;")
	public Class247 method3049(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class167[] local12 = null;
		@Pc(17) Class122 local17 = this.method3055(arg2);
		if (local17.anIntArray261 != null) {
			local12 = new Class167[local17.anIntArray261.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class79 local37 = arg0.method652(local17.anIntArray261[local27]);
				local12[local27] = new Class167(local37.anInt1915, local37.anInt1909, local37.anInt1907, local37.anInt1918, local37.anInt1919, local37.anInt1910, local37.anInt1914, local37.aBoolean110);
			}
		}
		return new Class247(local17.anInt3084, local12, local17.anInt3083, arg4, arg1, arg3);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	public void method3052() {
		@Pc(6) Class188 local6 = this.aClass188_35;
		synchronized (this.aClass188_35) {
			this.aClass188_35.method4169(5);
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	public void method3054() {
		@Pc(2) Class188 local2 = this.aClass188_35;
		synchronized (this.aClass188_35) {
			this.aClass188_35.method4154();
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lclient!ig;")
	private Class122 method3055(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_35;
		@Pc(16) Class122 local16;
		synchronized (this.aClass188_35) {
			local16 = (Class122) this.aClass188_35.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class171 local34 = this.aClass171_47;
		@Pc(43) byte[] local43;
		synchronized (this.aClass171_47) {
			local43 = this.aClass171_47.method3658(29, arg0);
		}
		local16 = new Class122();
		if (local43 != null) {
			local16.method2542(new Class2_Sub17(local43));
		}
		@Pc(65) Class188 local65 = this.aClass188_35;
		synchronized (this.aClass188_35) {
			this.aClass188_35.method4155((long) arg0, local16);
			return local16;
		}
	}
}
