import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class217 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!fa;")
	private final Class68 aClass68_44 = new Class68(16);

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_84;

	static {
		new Class83("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class217(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_84 = arg2;
		this.aClass76_84.method2108(29);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method4931() {
		@Pc(12) Class68 local12 = this.aClass68_44;
		synchronized (this.aClass68_44) {
			this.aClass68_44.method1791();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method4932() {
		@Pc(2) Class68 local2 = this.aClass68_44;
		synchronized (this.aClass68_44) {
			this.aClass68_44.method1777();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public void method4933() {
		@Pc(5) Class68 local5 = this.aClass68_44;
		synchronized (this.aClass68_44) {
			this.aClass68_44.method1788(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIILclient!tf;)Lclient!un;")
	public Class242 method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class226 arg4) {
		@Pc(12) Class5[] local12 = null;
		@Pc(17) Class170 local17 = this.method4935(arg1);
		if (local17.anIntArray341 != null) {
			local12 = new Class5[local17.anIntArray341.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class58 local37 = arg4.method5025(local17.anIntArray341[local27]);
				local12[local27] = new Class5(local37.anInt1719, local37.anInt1723, local37.anInt1729, local37.anInt1726, local37.anInt1728, local37.anInt1730, local37.anInt1731, local37.aBoolean160);
			}
		}
		return new Class242(local17.anInt5190, local12, local17.anInt5189, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)Lclient!oh;")
	private Class170 method4935(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_44;
		@Pc(16) Class170 local16;
		synchronized (this.aClass68_44) {
			local16 = (Class170) this.aClass68_44.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_84.method2104(arg0, 29);
		local16 = new Class170();
		if (local33 != null) {
			local16.method3966(new Class4_Sub12(local33));
		}
		@Pc(57) Class68 local57 = this.aClass68_44;
		synchronized (this.aClass68_44) {
			this.aClass68_44.method1779((long) arg0, local16);
			return local16;
		}
	}
}
