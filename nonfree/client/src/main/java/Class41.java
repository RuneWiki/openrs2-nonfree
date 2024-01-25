import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class41 {

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public int anInt1321 = 0;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
	public int anInt1323 = 0;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!sw;")
	private final Class277 aClass277_12 = new Class277(64);

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Lclient!je;")
	private Interface10 anInterface10_1 = null;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Lclient!dn;")
	private final Class69 aClass69_15;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!dn;")
	private final Class69 aClass69_16;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(ILclient!dn;Lclient!dn;Lclient!je;)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Interface10 arg3) {
		this.anInterface10_1 = arg3;
		this.aClass69_15 = arg2;
		this.aClass69_16 = arg1;
		if (this.aClass69_16 != null) {
			this.anInt1323 = this.aClass69_16.method1884(1);
		}
		if (this.aClass69_15 != null) {
			this.anInt1321 = this.aClass69_15.method1884(1);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(JI[ILclient!js;)Ljava/lang/String;")
	public String method1402(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class156 arg2) {
		if (this.anInterface10_1 != null) {
			@Pc(22) String local22 = this.anInterface10_1.method5659(arg1, arg0, arg2);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lclient!naa;")
	public Class1_Sub2_Sub11 method1404(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub11 local11 = (Class1_Sub2_Sub11) this.aClass277_12.method7014((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass69_15.method1888(arg0 & 0x7FFF, 1);
		} else {
			local27 = this.aClass69_16.method1888(arg0, 1);
		}
		local11 = new Class1_Sub2_Sub11();
		local11.aClass41_2 = this;
		if (local27 != null) {
			local11.method5429(new Class1_Sub17(local27));
		}
		if (arg0 >= 32768) {
			local11.method5422();
		}
		this.aClass277_12.method7016(local11, (long) arg0);
		return local11;
	}
}
