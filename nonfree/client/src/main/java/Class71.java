import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class71 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!ad;")
	private final Class5 aClass5_20 = new Class5(64);

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	public int anInt2259 = 0;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!dn;")
	private final Class56 aClass56_26;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	public final int anInt2258;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class71(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_26 = arg2;
		this.anInt2258 = this.aClass56_26.method1373(4);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!fs;")
	public Class81 method1743(@OriginalArg(1) int arg0) {
		@Pc(11) Class5 local11 = this.aClass5_20;
		@Pc(21) Class81 local21;
		synchronized (this.aClass5_20) {
			local21 = (Class81) this.aClass5_20.method104((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass56_26.method1384(4, arg0);
		local21 = new Class81();
		local21.aClass71_3 = this;
		local21.anInt2629 = arg0;
		if (local38 != null) {
			local21.method2166(new Class3_Sub2(local38));
		}
		local21.method2165();
		@Pc(63) Class5 local63 = this.aClass5_20;
		synchronized (this.aClass5_20) {
			this.aClass5_20.method114((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public void method1745() {
		@Pc(11) Class5 local11 = this.aClass5_20;
		synchronized (this.aClass5_20) {
			this.aClass5_20.method116();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)V")
	public void method1746() {
		@Pc(6) Class5 local6 = this.aClass5_20;
		synchronized (this.aClass5_20) {
			this.aClass5_20.method106(5);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method1748() {
		@Pc(6) Class5 local6 = this.aClass5_20;
		synchronized (this.aClass5_20) {
			this.aClass5_20.method110();
		}
	}
}
