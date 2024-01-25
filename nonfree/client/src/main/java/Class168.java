import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class168 {

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "Lclient!jv;")
	private final Class126 aClass126_33 = new Class126(64);

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Lclient!bu;")
	private final Class32 aClass32_59;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
	public final int anInt5093;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class168(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_59 = arg2;
		if (this.aClass32_59 == null) {
			this.anInt5093 = 0;
		} else {
			this.anInt5093 = this.aClass32_59.method790(16);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lclient!ks;")
	public Class137 method3904(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_33;
		@Pc(16) Class137 local16;
		synchronized (this.aClass126_33) {
			local16 = (Class137) this.aClass126_33.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass32_59.method785(arg0, 16);
		local16 = new Class137();
		if (local33 != null) {
			local16.method3290(new Class3_Sub7(local33));
		}
		@Pc(49) Class126 local49 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public void method3905() {
		@Pc(10) Class126 local10 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method3131();
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	public void method3907() {
		@Pc(6) Class126 local6 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method3135();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
	public void method3908() {
		@Pc(2) Class126 local2 = this.aClass126_33;
		synchronized (this.aClass126_33) {
			this.aClass126_33.method3140(5);
		}
	}
}
