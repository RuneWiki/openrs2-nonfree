import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class96 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Lclient!bh;")
	private final Class32 aClass32_21 = new Class32(64);

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
	public int anInt2570 = 0;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_38;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public final int anInt2566;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class96(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_38 = arg2;
		this.anInt2566 = this.aClass380_38.method8631(4);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method2120() {
		@Pc(6) Class32 local6 = this.aClass32_21;
		synchronized (this.aClass32_21) {
			this.aClass32_21.method632();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Lclient!bd;")
	public Class26 method2121(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_21;
		@Pc(16) Class26 local16;
		synchronized (this.aClass32_21) {
			local16 = (Class26) this.aClass32_21.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class380 local36 = this.aClass380_38;
		@Pc(45) byte[] local45;
		synchronized (this.aClass380_38) {
			local45 = this.aClass380_38.method8620(4, arg0);
		}
		local16 = new Class26();
		local16.anInt740 = arg0;
		local16.aClass96_2 = this;
		if (local45 != null) {
			local16.method594(new Class2_Sub22(local45));
		}
		local16.method590();
		@Pc(76) Class32 local76 = this.aClass32_21;
		synchronized (this.aClass32_21) {
			this.aClass32_21.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
	public void method2123() {
		@Pc(6) Class32 local6 = this.aClass32_21;
		synchronized (this.aClass32_21) {
			this.aClass32_21.method634(5);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	public void method2126() {
		@Pc(11) Class32 local11 = this.aClass32_21;
		synchronized (this.aClass32_21) {
			this.aClass32_21.method640();
		}
	}
}
