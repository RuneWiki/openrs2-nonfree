import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class226 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!jv;")
	private final Class126 aClass126_50 = new Class126(64);

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public int anInt6180 = 0;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!bu;")
	private final Class32 aClass32_78;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public final int anInt6178;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class226(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_78 = arg2;
		this.anInt6178 = this.aClass32_78.method790(4);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public void method4820() {
		@Pc(2) Class126 local2 = this.aClass126_50;
		synchronized (this.aClass126_50) {
			this.aClass126_50.method3135();
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public void method4821() {
		@Pc(6) Class126 local6 = this.aClass126_50;
		synchronized (this.aClass126_50) {
			this.aClass126_50.method3131();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public void method4822() {
		@Pc(2) Class126 local2 = this.aClass126_50;
		synchronized (this.aClass126_50) {
			this.aClass126_50.method3140(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Lclient!gf;")
	public Class87 method4823(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_50;
		@Pc(16) Class87 local16;
		synchronized (this.aClass126_50) {
			local16 = (Class87) this.aClass126_50.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass32_78.method785(arg0, 4);
		local16 = new Class87();
		local16.anInt2660 = arg0;
		local16.aClass226_3 = this;
		if (local41 != null) {
			local16.method2012(new Class3_Sub7(local41));
		}
		local16.method2011();
		@Pc(66) Class126 local66 = this.aClass126_50;
		synchronized (this.aClass126_50) {
			this.aClass126_50.method3132((long) arg0, local16);
			return local16;
		}
	}
}
