import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class194 {

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Lclient!wf;")
	private Class316 aClass316_41 = new Class316(64);

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!wf;")
	public final Class316 aClass316_42 = new Class316(500);

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Lclient!wf;")
	public final Class316 aClass316_43 = new Class316(30);

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Lclient!wf;")
	public final Class316 aClass316_44 = new Class316(50);

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!kda;")
	private final Class160 aClass160_68;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Lclient!kda;")
	public final Class160 aClass160_67;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!bt;IZLclient!kda;Lclient!kda;)V")
	public Class194(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aBoolean402 = arg2;
		this.aClass160_68 = arg3;
		this.aClass160_67 = arg4;
		if (this.aClass160_68 != null) {
			@Pc(47) int local47 = this.aClass160_68.method4206() - 1;
			this.aClass160_68.method4207(local47);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)V")
	public void method5074(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean402 != arg0) {
			this.aBoolean402 = arg0;
			this.method5076();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method5076() {
		@Pc(2) Class316 local2 = this.aClass316_41;
		synchronized (this.aClass316_41) {
			this.aClass316_41.method7794();
		}
		local2 = this.aClass316_42;
		synchronized (this.aClass316_42) {
			this.aClass316_42.method7794();
		}
		local2 = this.aClass316_43;
		synchronized (this.aClass316_43) {
			this.aClass316_43.method7794();
		}
		local2 = this.aClass316_44;
		synchronized (this.aClass316_44) {
			this.aClass316_44.method7794();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
	public void method5077(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean401) {
			this.aBoolean401 = arg0;
			this.method5076();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public void method5080(@OriginalArg(0) int arg0) {
		this.anInt5882 = arg0;
		@Pc(9) Class316 local9 = this.aClass316_42;
		synchronized (this.aClass316_42) {
			this.aClass316_42.method7794();
		}
		local9 = this.aClass316_43;
		synchronized (this.aClass316_43) {
			this.aClass316_43.method7794();
		}
		local9 = this.aClass316_44;
		synchronized (this.aClass316_44) {
			this.aClass316_44.method7794();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
	public void method5082(@OriginalArg(1) int arg0) {
		this.aClass316_41 = new Class316(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
	public void method5083() {
		@Pc(6) Class316 local6 = this.aClass316_41;
		synchronized (this.aClass316_41) {
			this.aClass316_41.method7803();
		}
		local6 = this.aClass316_42;
		synchronized (this.aClass316_42) {
			this.aClass316_42.method7803();
		}
		local6 = this.aClass316_43;
		synchronized (this.aClass316_43) {
			this.aClass316_43.method7803();
		}
		local6 = this.aClass316_44;
		synchronized (this.aClass316_44) {
			this.aClass316_44.method7803();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lclient!uh;")
	public Class288 method5084(@OriginalArg(1) int arg0) {
		@Pc(13) Class316 local13 = this.aClass316_41;
		@Pc(25) Class288 local25;
		synchronized (this.aClass316_41) {
			local25 = (Class288) this.aClass316_41.method7799((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class160 local38 = this.aClass160_68;
		@Pc(53) byte[] local53;
		synchronized (this.aClass160_68) {
			local53 = this.aClass160_68.method4198(Static28.method1190(arg0), Static203.method3758(arg0));
		}
		local25 = new Class288();
		local25.aClass194_5 = this;
		local25.anInt8333 = arg0;
		if (local53 != null) {
			local25.method7057(new Class1_Sub13(local53));
		}
		local25.method7063();
		if (!this.aBoolean402 && local25.aBoolean572) {
			local25.aStringArray45 = null;
			local25.anIntArray649 = null;
		}
		if (local25.aBoolean577) {
			local25.aBoolean575 = false;
			local25.anInt8363 = 0;
		}
		@Pc(105) Class316 local105 = this.aClass316_41;
		synchronized (this.aClass316_41) {
			this.aClass316_41.method7792((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)V")
	public void method5086() {
		@Pc(2) Class316 local2 = this.aClass316_41;
		synchronized (this.aClass316_41) {
			this.aClass316_41.method7791(5);
		}
		local2 = this.aClass316_42;
		synchronized (this.aClass316_42) {
			this.aClass316_42.method7791(5);
		}
		local2 = this.aClass316_43;
		synchronized (this.aClass316_43) {
			this.aClass316_43.method7791(5);
		}
		local2 = this.aClass316_44;
		synchronized (this.aClass316_44) {
			this.aClass316_44.method7791(5);
		}
	}
}
