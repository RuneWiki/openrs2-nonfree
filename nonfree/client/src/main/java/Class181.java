import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class181 {

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "Lclient!de;")
	private final Class69 aClass69_27 = new Class69(16);

	@OriginalMember(owner = "client!jha", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_122;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class181(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_122 = arg2;
		this.aClass238_122.method5592(29);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(BI)Lclient!vd;")
	private Class361 method4371(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_27;
		@Pc(16) Class361 local16;
		synchronized (this.aClass69_27) {
			local16 = (Class361) this.aClass69_27.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class238 local34 = this.aClass238_122;
		@Pc(43) byte[] local43;
		synchronized (this.aClass238_122) {
			local43 = this.aClass238_122.method5567(arg0, 29);
		}
		local16 = new Class361();
		if (local43 != null) {
			local16.method8469(new Class2_Sub17(local43));
		}
		@Pc(65) Class69 local65 = this.aClass69_27;
		synchronized (this.aClass69_27) {
			this.aClass69_27.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
	public void method4372() {
		@Pc(6) Class69 local6 = this.aClass69_27;
		synchronized (this.aClass69_27) {
			this.aClass69_27.method1905();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
	public void method4373() {
		@Pc(8) Class69 local8 = this.aClass69_27;
		synchronized (this.aClass69_27) {
			this.aClass69_27.method1910(5);
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILclient!mp;IIII)Lclient!mha;")
	public Class224 method4374(@OriginalArg(0) int arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) Class80[] local15 = null;
		@Pc(20) Class361 local20 = this.method4371(arg0);
		if (local20.anIntArray704 != null) {
			local15 = new Class80[local20.anIntArray704.length];
			for (@Pc(30) int local30 = 0; local30 < local15.length; local30++) {
				@Pc(40) Class306 local40 = arg1.method5412(local20.anIntArray704[local30]);
				local15[local30] = new Class80(local40.anInt8197, local40.anInt8202, local40.anInt8191, local40.anInt8196, local40.anInt8200, local40.anInt8201, local40.anInt8192, local40.aBoolean599);
			}
		}
		return new Class224(local20.anInt9966, local15, local20.anInt9968, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V")
	public void method4377() {
		@Pc(14) Class69 local14 = this.aClass69_27;
		synchronized (this.aClass69_27) {
			this.aClass69_27.method1904();
		}
	}
}
