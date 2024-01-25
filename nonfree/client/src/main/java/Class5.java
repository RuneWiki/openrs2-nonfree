import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!mo;")
	private final Class160 aClass160_2 = new Class160(64);

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public int anInt146 = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!nl;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public final int anInt143;

	static {
		new Class32("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class5(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_1 = arg2;
		this.anInt143 = this.aClass171_1.method3750(4);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Lclient!du;")
	public Class55 method86(@OriginalArg(0) int arg0) {
		@Pc(12) Class160 local12 = this.aClass160_2;
		@Pc(22) Class55 local22;
		synchronized (this.aClass160_2) {
			local22 = (Class55) this.aClass160_2.method3599((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass171_1.method3745(4, arg0);
		local22 = new Class55();
		local22.anInt1287 = arg0;
		local22.aClass5_2 = this;
		if (local39 != null) {
			local22.method1058(new Class2_Sub16(local39));
		}
		local22.method1060();
		@Pc(64) Class160 local64 = this.aClass160_2;
		synchronized (this.aClass160_2) {
			this.aClass160_2.method3602((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method87() {
		@Pc(2) Class160 local2 = this.aClass160_2;
		synchronized (this.aClass160_2) {
			this.aClass160_2.method3605();
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	public void method92() {
		@Pc(10) Class160 local10 = this.aClass160_2;
		synchronized (this.aClass160_2) {
			this.aClass160_2.method3595();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public void method93() {
		@Pc(2) Class160 local2 = this.aClass160_2;
		synchronized (this.aClass160_2) {
			this.aClass160_2.method3606(5);
		}
	}
}
