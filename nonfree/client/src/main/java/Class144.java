import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class144 {

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!vg;")
	private final Class342 aClass342_83 = new Class342(64);

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "Lclient!ri;")
	private final Class284 aClass284_68;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public final int anInt4613;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class144(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_68 = arg2;
		if (this.aClass284_68 == null) {
			this.anInt4613 = 0;
		} else {
			this.anInt4613 = this.aClass284_68.method6354(16);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!gr;")
	public Class118 method3700(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_83;
		@Pc(16) Class118 local16;
		synchronized (this.aClass342_83) {
			local16 = (Class118) this.aClass342_83.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_68;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_68) {
			local38 = this.aClass284_68.method6331(16, arg0);
		}
		local16 = new Class118();
		if (local38 != null) {
			local16.method3183(new Class3_Sub26(local38));
		}
		@Pc(60) Class342 local60 = this.aClass342_83;
		synchronized (this.aClass342_83) {
			this.aClass342_83.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	public void method3701() {
		@Pc(6) Class342 local6 = this.aClass342_83;
		synchronized (this.aClass342_83) {
			this.aClass342_83.method7697(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public void method3702() {
		@Pc(6) Class342 local6 = this.aClass342_83;
		synchronized (this.aClass342_83) {
			this.aClass342_83.method7693();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method3704() {
		@Pc(6) Class342 local6 = this.aClass342_83;
		synchronized (this.aClass342_83) {
			this.aClass342_83.method7687();
		}
	}
}
