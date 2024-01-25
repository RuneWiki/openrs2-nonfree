import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class380 {

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
	public int anInt10149;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!tja;")
	private final Class352 aClass352_73 = new Class352(64);

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "Lclient!tja;")
	public final Class352 aClass352_74 = new Class352(50);

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "Lclient!tja;")
	public final Class352 aClass352_75 = new Class352(5);

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Lclient!bt;")
	public final Class34 aClass34_128;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "Lclient!mja;")
	public final Class234 aClass234_7;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "Z")
	public boolean aBoolean785;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Lclient!bt;")
	private final Class34 aClass34_129;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!mja;IZLclient!bt;Lclient!bt;)V")
	public Class380(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) Class34 arg4) {
		this.aClass34_128 = arg4;
		this.aClass234_7 = arg0;
		this.aBoolean785 = arg2;
		this.aClass34_129 = arg3;
		if (this.aClass34_129 != null) {
			@Pc(41) int local41 = this.aClass34_129.method1247() - 1;
			this.aClass34_129.method1233(local41);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
	public void method8592() {
		@Pc(2) Class352 local2 = this.aClass352_74;
		synchronized (this.aClass352_74) {
			this.aClass352_74.method7659();
		}
		local2 = this.aClass352_75;
		synchronized (this.aClass352_75) {
			this.aClass352_75.method7659();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZZ)V")
	public void method8594(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean785 != arg0) {
			this.aBoolean785 = arg0;
			this.method8599();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)Lclient!td;")
	public Class345 method8596(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_73;
		@Pc(16) Class345 local16;
		synchronized (this.aClass352_73) {
			local16 = (Class345) this.aClass352_73.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_129;
		@Pc(42) byte[] local42;
		synchronized (this.aClass34_129) {
			local42 = this.aClass34_129.method1239(Static50.method1009(arg0), Static354.method4751(arg0));
		}
		local16 = new Class345();
		local16.anInt8792 = arg0;
		local16.aClass380_2 = this;
		if (local42 != null) {
			local16.method7533(new Class4_Sub11(local42));
		}
		local16.method7530();
		@Pc(80) Class352 local80 = this.aClass352_73;
		synchronized (this.aClass352_73) {
			this.aClass352_73.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)V")
	public void method8597() {
		@Pc(6) Class352 local6 = this.aClass352_73;
		synchronized (this.aClass352_73) {
			this.aClass352_73.method7663(5);
		}
		local6 = this.aClass352_74;
		synchronized (this.aClass352_74) {
			this.aClass352_74.method7663(5);
		}
		local6 = this.aClass352_75;
		synchronized (this.aClass352_75) {
			this.aClass352_75.method7663(5);
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(IB)V")
	public void method8598(@OriginalArg(0) int arg0) {
		this.anInt10149 = arg0;
		@Pc(9) Class352 local9 = this.aClass352_74;
		synchronized (this.aClass352_74) {
			this.aClass352_74.method7659();
		}
		local9 = this.aClass352_75;
		synchronized (this.aClass352_75) {
			this.aClass352_75.method7659();
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public void method8599() {
		@Pc(12) Class352 local12 = this.aClass352_73;
		synchronized (this.aClass352_73) {
			this.aClass352_73.method7659();
		}
		local12 = this.aClass352_74;
		synchronized (this.aClass352_74) {
			this.aClass352_74.method7659();
		}
		local12 = this.aClass352_75;
		synchronized (this.aClass352_75) {
			this.aClass352_75.method7659();
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
	public void method8600() {
		@Pc(6) Class352 local6 = this.aClass352_73;
		synchronized (this.aClass352_73) {
			this.aClass352_73.method7656();
		}
		local6 = this.aClass352_74;
		synchronized (this.aClass352_74) {
			this.aClass352_74.method7656();
		}
		local6 = this.aClass352_75;
		synchronized (this.aClass352_75) {
			this.aClass352_75.method7656();
		}
	}
}
