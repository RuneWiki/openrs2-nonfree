import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class120 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!ng;")
	private final Class167 aClass167_48 = new Class167(64);

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "Lclient!ic;")
	private final Class113 aClass113_61;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class120(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_61 = arg2;
		this.aClass113_61.method2271(31);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)V")
	public void method2408() {
		@Pc(10) Class167 local10 = this.aClass167_48;
		synchronized (this.aClass167_48) {
			this.aClass167_48.method3384(5);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public void method2411() {
		@Pc(6) Class167 local6 = this.aClass167_48;
		synchronized (this.aClass167_48) {
			this.aClass167_48.method3389();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
	public void method2412() {
		@Pc(8) Class167 local8 = this.aClass167_48;
		synchronized (this.aClass167_48) {
			this.aClass167_48.method3390();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)Lclient!pm;")
	public Class193 method2414(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_48;
		@Pc(18) Class193 local18;
		synchronized (this.aClass167_48) {
			local18 = (Class193) this.aClass167_48.method3386((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass113_61.method2274(31, arg0);
		local18 = new Class193();
		if (local35 != null) {
			local18.method4043(new Class1_Sub11(local35));
		}
		@Pc(51) Class167 local51 = this.aClass167_48;
		synchronized (this.aClass167_48) {
			this.aClass167_48.method3392(local18, (long) arg0);
			return local18;
		}
	}
}
