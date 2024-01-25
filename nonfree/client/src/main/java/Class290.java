import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class290 {

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "Lclient!wq;")
	private Class391 aClass391_45 = new Class391(64);

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
	public int anInt8103 = 0;

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "Lclient!la;")
	private final Class208 aClass208_110;

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
	public final int anInt8095;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class290(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_110 = arg2;
		this.anInt8095 = this.aClass208_110.method5005(4);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)V")
	public void method6970() {
		@Pc(2) Class391 local2 = this.aClass391_45;
		synchronized (this.aClass391_45) {
			this.aClass391_45.method9274(5);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method6971() {
		@Pc(14) Class391 local14 = this.aClass391_45;
		synchronized (this.aClass391_45) {
			this.aClass391_45.method9286();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method6973(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_45;
		synchronized (this.aClass391_45) {
			this.aClass391_45.method9276(0);
		}
		if (arg0 >= -3) {
			this.aClass391_45 = null;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lclient!ap;")
	public Class21 method6974(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_45;
		@Pc(16) Class21 local16;
		synchronized (this.aClass391_45) {
			local16 = (Class21) this.aClass391_45.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_110;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_110) {
			local39 = this.aClass208_110.method4991(4, arg0, 36);
		}
		local16 = new Class21();
		local16.anInt357 = arg0;
		local16.aClass290_1 = this;
		if (local39 != null) {
			local16.method350(new Class5_Sub23(local39));
		}
		local16.method349();
		@Pc(78) Class391 local78 = this.aClass391_45;
		synchronized (this.aClass391_45) {
			this.aClass391_45.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}
