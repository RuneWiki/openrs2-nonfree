import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class298 {

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
	public int anInt8898;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "Z")
	public boolean aBoolean621 = false;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "Lclient!jn;")
	private Class167 aClass167_49 = new Class167(64);

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "Lclient!jn;")
	public final Class167 aClass167_50 = new Class167(500);

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Lclient!jn;")
	public final Class167 aClass167_51 = new Class167(30);

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "Lclient!jn;")
	public final Class167 aClass167_52 = new Class167(50);

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "Lclient!vo;")
	public final Class348 aClass348_109;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "Lclient!vo;")
	private final Class348 aClass348_110;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!gn;IZLclient!vo;Lclient!vo;)V")
	public Class298(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class348 arg3, @OriginalArg(4) Class348 arg4) {
		this.aClass348_109 = arg4;
		this.aClass348_110 = arg3;
		this.aBoolean620 = arg2;
		if (this.aClass348_110 != null) {
			@Pc(47) int local47 = this.aClass348_110.method7985() - 1;
			this.aClass348_110.method7981(local47);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZB)V")
	public void method6814(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean620) {
			this.aBoolean620 = arg0;
			this.method6820();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
	public void method6816() {
		@Pc(2) Class167 local2 = this.aClass167_49;
		synchronized (this.aClass167_49) {
			this.aClass167_49.method3964(5);
		}
		local2 = this.aClass167_50;
		synchronized (this.aClass167_50) {
			this.aClass167_50.method3964(5);
		}
		local2 = this.aClass167_51;
		synchronized (this.aClass167_51) {
			this.aClass167_51.method3964(5);
		}
		local2 = this.aClass167_52;
		synchronized (this.aClass167_52) {
			this.aClass167_52.method3964(5);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BZ)V")
	public void method6817(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean621) {
			this.aBoolean621 = arg0;
			this.method6820();
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)V")
	public void method6818(@OriginalArg(1) int arg0) {
		this.aClass167_49 = new Class167(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
	public void method6820() {
		@Pc(6) Class167 local6 = this.aClass167_49;
		synchronized (this.aClass167_49) {
			this.aClass167_49.method3961();
		}
		local6 = this.aClass167_50;
		synchronized (this.aClass167_50) {
			this.aClass167_50.method3961();
		}
		local6 = this.aClass167_51;
		synchronized (this.aClass167_51) {
			this.aClass167_51.method3961();
		}
		local6 = this.aClass167_52;
		synchronized (this.aClass167_52) {
			this.aClass167_52.method3961();
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)Lclient!nf;")
	public Class233 method6822(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_49;
		@Pc(16) Class233 local16;
		synchronized (this.aClass167_49) {
			local16 = (Class233) this.aClass167_49.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_110;
		@Pc(44) byte[] local44;
		synchronized (this.aClass348_110) {
			local44 = this.aClass348_110.method7964(Static504.method7253(arg0), Static428.method6377(arg0));
		}
		local16 = new Class233();
		local16.anInt6713 = arg0;
		local16.aClass298_2 = this;
		if (local44 != null) {
			local16.method5283(new Class4_Sub13(local44));
		}
		local16.method5294();
		if (!this.aBoolean620 && local16.aBoolean458) {
			local16.aStringArray24 = null;
			local16.anIntArray376 = null;
		}
		if (local16.aBoolean465) {
			local16.anInt6692 = 0;
			local16.aBoolean454 = false;
		}
		@Pc(96) Class167 local96 = this.aClass167_49;
		synchronized (this.aClass167_49) {
			this.aClass167_49.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(II)V")
	public void method6823(@OriginalArg(1) int arg0) {
		this.anInt8898 = arg0;
		@Pc(9) Class167 local9 = this.aClass167_50;
		synchronized (this.aClass167_50) {
			this.aClass167_50.method3961();
		}
		local9 = this.aClass167_51;
		synchronized (this.aClass167_51) {
			this.aClass167_51.method3961();
		}
		local9 = this.aClass167_52;
		synchronized (this.aClass167_52) {
			this.aClass167_52.method3961();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
	public void method6824() {
		@Pc(6) Class167 local6 = this.aClass167_49;
		synchronized (this.aClass167_49) {
			this.aClass167_49.method3975();
		}
		local6 = this.aClass167_50;
		synchronized (this.aClass167_50) {
			this.aClass167_50.method3975();
		}
		local6 = this.aClass167_51;
		synchronized (this.aClass167_51) {
			this.aClass167_51.method3975();
		}
		local6 = this.aClass167_52;
		synchronized (this.aClass167_52) {
			this.aClass167_52.method3975();
		}
	}
}
