import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class36 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
	public static final byte[] aByteArray10;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!fc;")
	private Class77 aClass77_9 = new Class77(128);

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!fc;")
	public Class77 aClass77_10 = new Class77(64);

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_11;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!oi;")
	public final Class185 aClass185_10;

	static {
		@Pc(7) int local7 = 0;
		aByteArray10 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray10[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;Lclient!oi;)V")
	public Class36(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class185 arg3) {
		this.aClass185_11 = arg2;
		this.aClass185_10 = arg3;
		this.aClass185_11.method4011(36);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method657() {
		@Pc(10) Class77 local10 = this.aClass77_9;
		synchronized (this.aClass77_9) {
			this.aClass77_9.method1394();
		}
		local10 = this.aClass77_10;
		synchronized (this.aClass77_10) {
			this.aClass77_10.method1394();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Lclient!jd;")
	public Class128 method659(@OriginalArg(1) int arg0) {
		@Pc(11) Class77 local11 = this.aClass77_9;
		@Pc(21) Class128 local21;
		synchronized (this.aClass77_9) {
			local21 = (Class128) this.aClass77_9.method1387((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class185 local34 = this.aClass185_11;
		@Pc(43) byte[] local43;
		synchronized (this.aClass185_11) {
			local43 = this.aClass185_11.method4002(36, arg0);
		}
		local21 = new Class128();
		local21.anInt3498 = arg0;
		local21.aClass36_1 = this;
		if (local43 != null) {
			local21.method2739(new Class1_Sub19(local43));
		}
		local21.method2743();
		@Pc(76) Class77 local76 = this.aClass77_9;
		synchronized (this.aClass77_9) {
			this.aClass77_9.method1396(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public void method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass77_9 = new Class77(arg0);
		this.aClass77_10 = new Class77(arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method661() {
		@Pc(2) Class77 local2 = this.aClass77_9;
		synchronized (this.aClass77_9) {
			this.aClass77_9.method1395();
		}
		local2 = this.aClass77_10;
		synchronized (this.aClass77_10) {
			this.aClass77_10.method1395();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	public void method662() {
		@Pc(2) Class77 local2 = this.aClass77_9;
		synchronized (this.aClass77_9) {
			this.aClass77_9.method1386(5);
		}
		local2 = this.aClass77_10;
		synchronized (this.aClass77_10) {
			this.aClass77_10.method1386(5);
		}
	}
}
