import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class25_Sub4_Sub2 extends Class25_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!io", name = "T", descriptor = "[Lclient!eh;")
	private static final Class66[] aClass66Array1 = new Class66[32];

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!pq;")
	public Class25_Sub4 aClass25_Sub4_1;

	static {
		@Pc(65) Class66[] local65 = Static145.method2191();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass66Array1[local65[local67].anInt1518] = local65[local67];
		}
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIILclient!pq;)V")
	public Class25_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub4 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass25_Sub4_1 = arg3;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return 0;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
	}
}
