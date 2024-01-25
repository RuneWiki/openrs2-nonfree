import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class245 {

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!ui;")
	private final Class359 aClass359_49 = new Class359(64);

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	public int anInt6719 = 0;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "Lclient!lga;")
	private final Class223 aClass223_83;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	public final int anInt6714;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class245(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_83 = arg2;
		this.anInt6714 = this.aClass223_83.method5264(4);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public void method5970() {
		@Pc(6) Class359 local6 = this.aClass359_49;
		synchronized (this.aClass359_49) {
			this.aClass359_49.method8507();
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	public void method5972() {
		@Pc(6) Class359 local6 = this.aClass359_49;
		synchronized (this.aClass359_49) {
			this.aClass359_49.method8511();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)V")
	public void method5973() {
		@Pc(12) Class359 local12 = this.aClass359_49;
		synchronized (this.aClass359_49) {
			this.aClass359_49.method8502(5);
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(IB)Lclient!nga;")
	public Class249 method5974(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_49;
		@Pc(16) Class249 local16;
		synchronized (this.aClass359_49) {
			local16 = (Class249) this.aClass359_49.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_83;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_83) {
			local39 = this.aClass223_83.method5267(arg0, 4);
		}
		local16 = new Class249();
		local16.anInt6863 = arg0;
		local16.aClass245_4 = this;
		if (local39 != null) {
			local16.method6098(new Class6_Sub15(local39));
		}
		local16.method6100();
		@Pc(81) Class359 local81 = this.aClass359_49;
		synchronized (this.aClass359_49) {
			this.aClass359_49.method8515((long) arg0, local16);
			return local16;
		}
	}
}
