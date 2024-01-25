import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class125 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!nj;")
	private final Class171 aClass171_27 = new Class171(128);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!mg;")
	private final Class160 aClass160_29;

	static {
		new Class209("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class125(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_29 = arg2;
		if (this.aClass160_29 != null) {
			@Pc(20) int local20 = this.aClass160_29.method3715() - 1;
			this.aClass160_29.method3722(local20);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!vu;")
	public Class255 method2841(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_27;
		@Pc(16) Class255 local16;
		synchronized (this.aClass171_27) {
			local16 = (Class255) this.aClass171_27.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass160_29.method3696(Static423.method5844(arg0), Static399.method5262(arg0));
		local16 = new Class255();
		if (local39 != null) {
			local16.method5656(new Class2_Sub23(local39));
		}
		@Pc(61) Class171 local61 = this.aClass171_27;
		synchronized (this.aClass171_27) {
			this.aClass171_27.method3940((long) arg0, local16);
			return local16;
		}
	}
}
