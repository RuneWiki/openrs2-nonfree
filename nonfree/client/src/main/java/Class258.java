import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class258 {

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16384];

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!fr;")
	private final Class91 aClass91_98 = new Class91(64);

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!qs;")
	private final Class211 aClass211_85;

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			aFloatArray29[local14] = (float) Math.sin(local12 * (double) local14);
			aFloatArray28[local14] = (float) Math.cos((double) local14 * local12);
		}
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class258(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_85 = arg2;
		this.aClass211_85.method4772(32);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!qv;")
	public Class212 method5771(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_98;
		@Pc(16) Class212 local16;
		synchronized (this.aClass91_98) {
			local16 = (Class212) this.aClass91_98.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_85;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_85) {
			local38 = this.aClass211_85.method4758(arg0, 32);
		}
		local16 = new Class212();
		if (local38 != null) {
			local16.method4814(new Class1_Sub3(local38));
		}
		@Pc(60) Class91 local60 = this.aClass91_98;
		synchronized (this.aClass91_98) {
			this.aClass91_98.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public void method5773() {
		@Pc(6) Class91 local6 = this.aClass91_98;
		synchronized (this.aClass91_98) {
			this.aClass91_98.method1993();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method5774() {
		@Pc(10) Class91 local10 = this.aClass91_98;
		synchronized (this.aClass91_98) {
			this.aClass91_98.method1999();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)V")
	public void method5776() {
		@Pc(6) Class91 local6 = this.aClass91_98;
		synchronized (this.aClass91_98) {
			this.aClass91_98.method1998(5);
		}
	}
}
