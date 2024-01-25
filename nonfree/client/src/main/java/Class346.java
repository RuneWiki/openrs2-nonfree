import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class346 {

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "Lclient!dka;")
	public final Class85 aClass85_60 = new Class85(20);

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "Lclient!dka;")
	private final Class85 aClass85_61 = new Class85(64);

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "Lclient!nca;")
	private final Class254 aClass254_147;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "Lclient!nca;")
	public final Class254 aClass254_148;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;)V")
	public Class346(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_147 = arg2;
		this.aClass254_148 = arg3;
		this.aClass254_147.method6101(46);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)Lclient!qk;")
	public Class312 method8207(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_61;
		@Pc(16) Class312 local16;
		synchronized (this.aClass85_61) {
			local16 = (Class312) this.aClass85_61.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_147;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_147) {
			local39 = this.aClass254_147.method6087(arg0, 46);
		}
		local16 = new Class312();
		local16.aClass346_2 = this;
		if (local39 != null) {
			local16.method7375(new Class2_Sub20(local39));
		}
		@Pc(66) Class85 local66 = this.aClass85_61;
		synchronized (this.aClass85_61) {
			this.aClass85_61.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)V")
	public void method8208() {
		@Pc(14) Class85 local14 = this.aClass85_61;
		synchronized (this.aClass85_61) {
			this.aClass85_61.method1742(5);
		}
		local14 = this.aClass85_60;
		synchronized (this.aClass85_60) {
			this.aClass85_60.method1742(5);
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
	public void method8209() {
		@Pc(2) Class85 local2 = this.aClass85_61;
		synchronized (this.aClass85_61) {
			this.aClass85_61.method1748();
		}
		local2 = this.aClass85_60;
		synchronized (this.aClass85_60) {
			this.aClass85_60.method1748();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
	public void method8212() {
		@Pc(6) Class85 local6 = this.aClass85_61;
		synchronized (this.aClass85_61) {
			this.aClass85_61.method1741();
		}
		local6 = this.aClass85_60;
		synchronized (this.aClass85_60) {
			this.aClass85_60.method1741();
		}
	}
}
