import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class25 {

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!ad;")
	private Class5 aClass5_2 = new Class5(64);

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "Lclient!ad;")
	public final Class5 aClass5_3 = new Class5(500);

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "Lclient!ad;")
	public final Class5 aClass5_4 = new Class5(30);

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!ad;")
	public final Class5 aClass5_5 = new Class5(50);

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!dn;")
	private final Class56 aClass56_15;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Lclient!dn;")
	public final Class56 aClass56_14;

	static {
		new Class175("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
		new Class175("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!gt;IZLclient!dn;Lclient!dn;)V")
	public Class25(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class56 arg3, @OriginalArg(4) Class56 arg4) {
		this.aClass56_15 = arg3;
		this.aBoolean88 = arg2;
		this.aClass56_14 = arg4;
		if (this.aClass56_15 != null) {
			@Pc(47) int local47 = this.aClass56_15.method1380() - 1;
			this.aClass56_15.method1373(local47);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public void method846() {
		@Pc(2) Class5 local2 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			this.aClass5_2.method110();
		}
		local2 = this.aClass5_3;
		synchronized (this.aClass5_3) {
			this.aClass5_3.method110();
		}
		local2 = this.aClass5_4;
		synchronized (this.aClass5_4) {
			this.aClass5_4.method110();
		}
		local2 = this.aClass5_5;
		synchronized (this.aClass5_5) {
			this.aClass5_5.method110();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public void method848(@OriginalArg(1) int arg0) {
		this.anInt959 = arg0;
		@Pc(15) Class5 local15 = this.aClass5_3;
		synchronized (this.aClass5_3) {
			this.aClass5_3.method116();
		}
		local15 = this.aClass5_4;
		synchronized (this.aClass5_4) {
			this.aClass5_4.method116();
		}
		local15 = this.aClass5_5;
		synchronized (this.aClass5_5) {
			this.aClass5_5.method116();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZ)V")
	public void method849(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean88) {
			this.aBoolean88 = arg0;
			this.method850();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method850() {
		@Pc(2) Class5 local2 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			this.aClass5_2.method116();
		}
		@Pc(29) Class5 local29 = this.aClass5_3;
		synchronized (this.aClass5_3) {
			this.aClass5_3.method116();
		}
		local29 = this.aClass5_4;
		synchronized (this.aClass5_4) {
			this.aClass5_4.method116();
		}
		local29 = this.aClass5_5;
		synchronized (this.aClass5_5) {
			this.aClass5_5.method116();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)Lclient!jt;")
	public Class128 method855(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_2;
		@Pc(16) Class128 local16;
		synchronized (this.aClass5_2) {
			local16 = (Class128) this.aClass5_2.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass56_15.method1384(Static406.method5476(arg0), Static37.method889(arg0));
		local16 = new Class128();
		local16.anInt4027 = arg0;
		local16.aClass25_2 = this;
		if (local37 != null) {
			local16.method3304(new Class3_Sub2(local37));
		}
		local16.method3309();
		if (!this.aBoolean88 && local16.aBoolean315) {
			local16.aStringArray90 = null;
			local16.anIntArray303 = null;
		}
		if (local16.aBoolean318) {
			local16.anInt4039 = 0;
			local16.aBoolean316 = false;
		}
		@Pc(83) Class5 local83 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			this.aClass5_2.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)V")
	public void method856(@OriginalArg(1) int arg0) {
		this.aClass5_2 = new Class5(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V")
	public void method857() {
		@Pc(2) Class5 local2 = this.aClass5_2;
		synchronized (this.aClass5_2) {
			this.aClass5_2.method106(5);
		}
		local2 = this.aClass5_3;
		synchronized (this.aClass5_3) {
			this.aClass5_3.method106(5);
		}
		local2 = this.aClass5_4;
		synchronized (this.aClass5_4) {
			this.aClass5_4.method106(5);
		}
		local2 = this.aClass5_5;
		synchronized (this.aClass5_5) {
			this.aClass5_5.method106(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	public void method859(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean87) {
			this.aBoolean87 = arg0;
			this.method850();
		}
	}
}
