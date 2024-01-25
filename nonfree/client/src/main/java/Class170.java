import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class170 {

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!jv;")
	private final Class126 aClass126_34 = new Class126(64);

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "Lclient!jv;")
	private final Class126 aClass126_35 = new Class126(100);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!bu;")
	private final Class32 aClass32_62;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;Lclient!bu;)V")
	public Class170(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) Class32 arg4) {
		this.aClass32_62 = arg2;
		if (this.aClass32_62 != null) {
			@Pc(26) int local26 = this.aClass32_62.method809() - 1;
			this.aClass32_62.method790(local26);
		}
		Static363.method4782(arg4, arg3);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Lclient!wg;")
	public Class3_Sub4_Sub16 method3928(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_35;
		@Pc(16) Class3_Sub4_Sub16 local16;
		synchronized (this.aClass126_35) {
			local16 = (Class3_Sub4_Sub16) this.aClass126_35.method3141((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub4_Sub16(arg0);
				this.aClass126_35.method3132((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method5869() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method3929() {
		@Pc(6) Class126 local6 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method3131();
		}
		local6 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method3131();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZ)V")
	public void method3931() {
		@Pc(11) Class126 local11 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method3140(5);
		}
		local11 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method3140(5);
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
	public void method3934() {
		@Pc(6) Class126 local6 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method3135();
		}
		local6 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method3135();
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)Lclient!kf;")
	public Class128 method3936(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_34;
		@Pc(16) Class128 local16;
		synchronized (this.aClass126_34) {
			local16 = (Class128) this.aClass126_34.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass32_62.method785(Static388.method5048(arg0), Static15.method329(arg0));
		local16 = new Class128();
		local16.aClass170_4 = this;
		local16.anInt3967 = arg0;
		if (local37 != null) {
			local16.method3189(new Class3_Sub7(local37));
		}
		local16.method3182();
		@Pc(62) Class126 local62 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method3132((long) arg0, local16);
			return local16;
		}
	}
}
