import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class58 {

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_14 = new Class268(16);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!uu;")
	private final Class250 aClass250_28;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class58(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_28 = arg2;
		this.aClass250_28.method5815(29);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method1541() {
		@Pc(10) Class268 local10 = this.aClass268_14;
		synchronized (this.aClass268_14) {
			this.aClass268_14.method6168();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!od;IIIII)Lclient!er;")
	public Class64 method1542(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class127[] local12 = null;
		@Pc(17) Class99 local17 = this.method1545(arg4);
		if (local17.anIntArray146 != null) {
			local12 = new Class127[local17.anIntArray146.length];
			for (@Pc(27) int local27 = 0; local27 < local12.length; local27++) {
				@Pc(37) Class56 local37 = arg0.method4192(local17.anIntArray146[local27]);
				local12[local27] = new Class127(local37.anInt1578, local37.anInt1574, local37.anInt1573, local37.anInt1571, local37.anInt1579, local37.anInt1572, local37.anInt1576, local37.aBoolean106);
			}
		}
		return new Class64(local17.anInt2754, local12, local17.anInt2751, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method1544() {
		@Pc(7) Class268 local7 = this.aClass268_14;
		synchronized (this.aClass268_14) {
			this.aClass268_14.method6173(5);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lclient!hh;")
	private Class99 method1545(@OriginalArg(1) int arg0) {
		@Pc(11) Class268 local11 = this.aClass268_14;
		@Pc(21) Class99 local21;
		synchronized (this.aClass268_14) {
			local21 = (Class99) this.aClass268_14.method6166((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class250 local34 = this.aClass250_28;
		@Pc(43) byte[] local43;
		synchronized (this.aClass250_28) {
			local43 = this.aClass250_28.method5806(29, arg0);
		}
		local21 = new Class99();
		if (local43 != null) {
			local21.method2349(new Class3_Sub25(local43));
		}
		@Pc(65) Class268 local65 = this.aClass268_14;
		synchronized (this.aClass268_14) {
			this.aClass268_14.method6164(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method1546() {
		@Pc(10) Class268 local10 = this.aClass268_14;
		synchronized (this.aClass268_14) {
			this.aClass268_14.method6160();
		}
	}
}
