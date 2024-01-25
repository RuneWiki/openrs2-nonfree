import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class48 {

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	public int anInt1126;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!mo;")
	private final Class160 aClass160_11 = new Class160(64);

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Lclient!mo;")
	public final Class160 aClass160_12 = new Class160(50);

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!mo;")
	public final Class160 aClass160_13 = new Class160(5);

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!nl;")
	private final Class171 aClass171_20;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!nl;")
	public final Class171 aClass171_21;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public final int anInt1116;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!lo;IZLclient!nl;Lclient!nl;)V")
	public Class48(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_20 = arg3;
		this.aBoolean90 = arg2;
		this.aClass171_21 = arg4;
		this.anInt1116 = arg1;
		if (this.aClass171_20 != null) {
			@Pc(41) int local41 = this.aClass171_20.method3770() - 1;
			this.aClass171_20.method3750(local41);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public void method948(@OriginalArg(0) int arg0) {
		this.anInt1126 = arg0;
		@Pc(9) Class160 local9 = this.aClass160_12;
		synchronized (this.aClass160_12) {
			this.aClass160_12.method3595();
		}
		local9 = this.aClass160_13;
		synchronized (this.aClass160_13) {
			this.aClass160_13.method3595();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public void method949() {
		@Pc(6) Class160 local6 = this.aClass160_11;
		synchronized (this.aClass160_11) {
			this.aClass160_11.method3595();
		}
		local6 = this.aClass160_12;
		synchronized (this.aClass160_12) {
			this.aClass160_12.method3595();
		}
		local6 = this.aClass160_13;
		synchronized (this.aClass160_13) {
			this.aClass160_13.method3595();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Lclient!kc;")
	public Class133 method951(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_11;
		@Pc(18) Class133 local18;
		synchronized (this.aClass160_11) {
			local18 = (Class133) this.aClass160_11.method3599((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass171_20.method3745(Static247.method4895(arg0), Static130.method2558(arg0));
		local18 = new Class133();
		local18.aClass48_1 = this;
		local18.anInt3330 = arg0;
		if (local39 != null) {
			local18.method3092(new Class2_Sub16(local39));
		}
		local18.method3096();
		@Pc(64) Class160 local64 = this.aClass160_11;
		synchronized (this.aClass160_11) {
			this.aClass160_11.method3602((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method952() {
		@Pc(2) Class160 local2 = this.aClass160_11;
		synchronized (this.aClass160_11) {
			this.aClass160_11.method3605();
		}
		local2 = this.aClass160_12;
		synchronized (this.aClass160_12) {
			this.aClass160_12.method3605();
		}
		local2 = this.aClass160_13;
		synchronized (this.aClass160_13) {
			this.aClass160_13.method3605();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
	public void method953() {
		@Pc(6) Class160 local6 = this.aClass160_11;
		synchronized (this.aClass160_11) {
			this.aClass160_11.method3606(5);
		}
		local6 = this.aClass160_12;
		synchronized (this.aClass160_12) {
			this.aClass160_12.method3606(5);
		}
		local6 = this.aClass160_13;
		synchronized (this.aClass160_13) {
			this.aClass160_13.method3606(5);
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	public void method955() {
		@Pc(2) Class160 local2 = this.aClass160_12;
		synchronized (this.aClass160_12) {
			this.aClass160_12.method3595();
		}
		local2 = this.aClass160_13;
		synchronized (this.aClass160_13) {
			this.aClass160_13.method3595();
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)V")
	public void method956(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean90) {
			this.aBoolean90 = arg0;
			this.method949();
		}
	}
}
