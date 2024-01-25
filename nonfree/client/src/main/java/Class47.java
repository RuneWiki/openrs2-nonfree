import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class47 {

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "Lclient!ui;")
	private final Class359 aClass359_6 = new Class359(64);

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "Lclient!lga;")
	private final Class223 aClass223_10;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
	public final int anInt694;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class47(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_10 = arg2;
		if (this.aClass223_10 == null) {
			this.anInt694 = 0;
		} else {
			this.anInt694 = this.aClass223_10.method5264(16);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method677() {
		@Pc(6) Class359 local6 = this.aClass359_6;
		synchronized (this.aClass359_6) {
			this.aClass359_6.method8511();
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)V")
	public void method678() {
		@Pc(6) Class359 local6 = this.aClass359_6;
		synchronized (this.aClass359_6) {
			this.aClass359_6.method8502(5);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Lclient!wda;")
	public Class390 method679(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_6;
		@Pc(18) Class390 local18;
		synchronized (this.aClass359_6) {
			local18 = (Class390) this.aClass359_6.method8517((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class223 local32 = this.aClass223_10;
		@Pc(41) byte[] local41;
		synchronized (this.aClass223_10) {
			local41 = this.aClass223_10.method5267(arg0, 16);
		}
		local18 = new Class390();
		if (local41 != null) {
			local18.method8851(new Class6_Sub15(local41));
		}
		@Pc(65) Class359 local65 = this.aClass359_6;
		synchronized (this.aClass359_6) {
			this.aClass359_6.method8515((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	public void method682() {
		@Pc(6) Class359 local6 = this.aClass359_6;
		synchronized (this.aClass359_6) {
			this.aClass359_6.method8507();
		}
	}
}
