import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class367 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!tq;")
	private final Class340 aClass340_64 = new Class340(64);

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public int anInt10264 = 0;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!wm;")
	private final Class390 aClass390_123;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public final int anInt10260;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class367(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_123 = arg2;
		this.anInt10260 = this.aClass390_123.method8913(4);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lclient!daa;")
	public Class74 method8496(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_64;
		@Pc(16) Class74 local16;
		synchronized (this.aClass340_64) {
			local16 = (Class74) this.aClass340_64.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_123;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_123) {
			local38 = this.aClass390_123.method8914(4, arg0);
		}
		local16 = new Class74();
		local16.anInt2144 = arg0;
		local16.aClass367_3 = this;
		if (local38 != null) {
			local16.method1938(new Class5_Sub41(local38));
		}
		local16.method1936();
		@Pc(69) Class340 local69 = this.aClass340_64;
		synchronized (this.aClass340_64) {
			this.aClass340_64.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public void method8497() {
		@Pc(2) Class340 local2 = this.aClass340_64;
		synchronized (this.aClass340_64) {
			this.aClass340_64.method7987();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public void method8498() {
		@Pc(10) Class340 local10 = this.aClass340_64;
		synchronized (this.aClass340_64) {
			this.aClass340_64.method8000();
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
	public void method8499() {
		@Pc(6) Class340 local6 = this.aClass340_64;
		synchronized (this.aClass340_64) {
			this.aClass340_64.method7996(5);
		}
	}
}
