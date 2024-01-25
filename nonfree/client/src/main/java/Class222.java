import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class222 {

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!wf;")
	private final Class316 aClass316_46 = new Class316(64);

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Lclient!wf;")
	public final Class316 aClass316_47 = new Class316(50);

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Lclient!wf;")
	public final Class316 aClass316_48 = new Class316(5);

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
	public boolean aBoolean431;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!bt;")
	public final Class37 aClass37_2;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Lclient!kda;")
	private final Class160 aClass160_75;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!kda;")
	public final Class160 aClass160_76;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!bt;IZLclient!kda;Lclient!kda;)V")
	public Class222(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aBoolean431 = arg2;
		this.aClass37_2 = arg0;
		this.aClass160_75 = arg3;
		this.aClass160_76 = arg4;
		if (this.aClass160_75 != null) {
			@Pc(41) int local41 = this.aClass160_75.method4206() - 1;
			this.aClass160_75.method4207(local41);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public void method5583() {
		@Pc(2) Class316 local2 = this.aClass316_46;
		synchronized (this.aClass316_46) {
			this.aClass316_46.method7794();
		}
		local2 = this.aClass316_47;
		synchronized (this.aClass316_47) {
			this.aClass316_47.method7794();
		}
		local2 = this.aClass316_48;
		synchronized (this.aClass316_48) {
			this.aClass316_48.method7794();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
	public void method5585() {
		@Pc(14) Class316 local14 = this.aClass316_46;
		synchronized (this.aClass316_46) {
			this.aClass316_46.method7791(5);
		}
		local14 = this.aClass316_47;
		synchronized (this.aClass316_47) {
			this.aClass316_47.method7791(5);
		}
		local14 = this.aClass316_48;
		synchronized (this.aClass316_48) {
			this.aClass316_48.method7791(5);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	public void method5586(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean431) {
			this.aBoolean431 = arg0;
			this.method5583();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)Lclient!qda;")
	public Class238 method5587(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_46;
		@Pc(16) Class238 local16;
		synchronized (this.aClass316_46) {
			local16 = (Class238) this.aClass316_46.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass160_75) {
			local42 = this.aClass160_75.method4198(Static25.method1152(arg0), Static457.method6652(arg0));
		}
		local16 = new Class238();
		local16.aClass222_2 = this;
		local16.anInt6770 = arg0;
		if (local42 != null) {
			local16.method5864(new Class1_Sub13(local42));
		}
		local16.method5869();
		@Pc(73) Class316 local73 = this.aClass316_46;
		synchronized (this.aClass316_46) {
			this.aClass316_46.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public void method5588(@OriginalArg(0) int arg0) {
		this.anInt6436 = arg0;
		@Pc(9) Class316 local9 = this.aClass316_47;
		synchronized (this.aClass316_47) {
			this.aClass316_47.method7794();
		}
		local9 = this.aClass316_48;
		synchronized (this.aClass316_48) {
			this.aClass316_48.method7794();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
	public void method5590() {
		@Pc(6) Class316 local6 = this.aClass316_46;
		synchronized (this.aClass316_46) {
			this.aClass316_46.method7803();
		}
		local6 = this.aClass316_47;
		synchronized (this.aClass316_47) {
			this.aClass316_47.method7803();
		}
		local6 = this.aClass316_48;
		synchronized (this.aClass316_48) {
			this.aClass316_48.method7803();
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method5593() {
		@Pc(6) Class316 local6 = this.aClass316_47;
		synchronized (this.aClass316_47) {
			this.aClass316_47.method7794();
		}
		local6 = this.aClass316_48;
		synchronized (this.aClass316_48) {
			this.aClass316_48.method7794();
		}
	}
}
