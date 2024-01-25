import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class77 {

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "Lclient!nga;")
	private final Class233 aClass233_12 = new Class233(64);

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
	public int anInt1920 = 0;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_24;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public final int anInt1912;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class77(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_24 = arg2;
		this.anInt1912 = this.aClass97_24.method2569(4);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	public void method1681() {
		@Pc(2) Class233 local2 = this.aClass233_12;
		synchronized (this.aClass233_12) {
			this.aClass233_12.method5663();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	public void method1682() {
		@Pc(2) Class233 local2 = this.aClass233_12;
		synchronized (this.aClass233_12) {
			this.aClass233_12.method5665();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lclient!ul;")
	public Class342 method1683(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_12;
		@Pc(16) Class342 local16;
		synchronized (this.aClass233_12) {
			local16 = (Class342) this.aClass233_12.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_24;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_24) {
			local38 = this.aClass97_24.method2545(arg0, 4);
		}
		local16 = new Class342();
		local16.aClass77_5 = this;
		local16.anInt9513 = arg0;
		if (local38 != null) {
			local16.method8006(new Class2_Sub34(local38));
		}
		local16.method8003();
		@Pc(69) Class233 local69 = this.aClass233_12;
		synchronized (this.aClass233_12) {
			this.aClass233_12.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
	public void method1684() {
		@Pc(2) Class233 local2 = this.aClass233_12;
		synchronized (this.aClass233_12) {
			this.aClass233_12.method5664(5);
		}
	}
}
