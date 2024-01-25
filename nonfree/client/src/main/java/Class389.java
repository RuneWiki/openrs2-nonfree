import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class389 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "Lclient!pja;")
	private final Class279 aClass279_67 = new Class279(64);

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_146;

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public final int anInt10257;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class389(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_146 = arg2;
		if (this.aClass143_146 == null) {
			this.anInt10257 = 0;
		} else {
			this.anInt10257 = this.aClass143_146.method3123(16);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Lclient!kha;")
	public Class209 method8671(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_67;
		@Pc(16) Class209 local16;
		synchronized (this.aClass279_67) {
			local16 = (Class209) this.aClass279_67.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_146;
		@Pc(40) byte[] local40;
		synchronized (this.aClass143_146) {
			local40 = this.aClass143_146.method3125(arg0, 16);
		}
		local16 = new Class209();
		if (local40 != null) {
			local16.method4732(new Class3_Sub17(local40));
		}
		@Pc(68) Class279 local68 = this.aClass279_67;
		synchronized (this.aClass279_67) {
			this.aClass279_67.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)V")
	public void method8674() {
		@Pc(2) Class279 local2 = this.aClass279_67;
		synchronized (this.aClass279_67) {
			this.aClass279_67.method6630(5);
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)V")
	public void method8676() {
		@Pc(6) Class279 local6 = this.aClass279_67;
		synchronized (this.aClass279_67) {
			this.aClass279_67.method6637();
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
	public void method8678() {
		@Pc(2) Class279 local2 = this.aClass279_67;
		synchronized (this.aClass279_67) {
			this.aClass279_67.method6638();
		}
	}
}
